package com.microservice.mailconfirmation.controller;

import com.microservice.mailconfirmation.model.UserConfirmation;
import com.microservice.mailconfirmation.service.UserConfirmationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping
public class ConfirmationController {

    @Autowired
    private UserConfirmationService userConfirmationService;

    @PostMapping("confirm")
    public UserConfirmation persistUserConfirmation(@RequestBody UserConfirmation userConfirmation) {
        return userConfirmationService.persistUserConfirmation(userConfirmation);
    }
}
