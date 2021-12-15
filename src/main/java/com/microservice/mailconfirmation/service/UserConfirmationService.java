package com.microservice.mailconfirmation.service;

import com.microservice.mailconfirmation.model.UserConfirmation;
import com.microservice.mailconfirmation.repository.UserConfirmationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserConfirmationService {

    @Autowired
    private UserConfirmationRepository userConfirmationRepository;

    public UserConfirmation persistUserConfirmation(UserConfirmation userConfirmation) {
        return userConfirmationRepository.save(userConfirmation);
    }
}
