package com.microservice.mailconfirmation.service;

import com.microservice.mailconfirmation.model.User;
import com.microservice.mailconfirmation.repository.UserRepository;
import com.microservice.mailconfirmation.repository.UsersDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UsersDataRepository userDataRepository;

    public User persistUserConfirmation(User user) {
        userDataRepository.save(user.getUsersData());
        return userRepository.save(user);
    }
}
