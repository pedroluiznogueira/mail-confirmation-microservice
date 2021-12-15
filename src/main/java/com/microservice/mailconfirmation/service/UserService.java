package com.microservice.mailconfirmation.service;

import com.microservice.mailconfirmation.interfaces.Confirmation;
import com.microservice.mailconfirmation.model.Confirm;
import com.microservice.mailconfirmation.model.User;
import com.microservice.mailconfirmation.repository.UserRepository;
import com.microservice.mailconfirmation.repository.UsersDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UsersDataRepository userDataRepository;

    @Autowired
    private Confirmation confirmation;

    public User persistUserConfirmation(User user) {
        userDataRepository.save(user.getUsersData());
        return userRepository.save(user);
    }

    public User confirmEmail(Confirm confirm) {
        List<User> users = userRepository.findAll();

        for (User user: users) {
            if (user.getUsername().equals(confirm.getUsername())) {
                confirmation.confirmEmail(user);
                userRepository.delete(user);
                return user;
            }
        }
        return null;
    }
}
