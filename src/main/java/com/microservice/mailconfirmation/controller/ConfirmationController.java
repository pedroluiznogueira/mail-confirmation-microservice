package com.microservice.mailconfirmation.controller;

import com.microservice.mailconfirmation.model.Confirm;
import com.microservice.mailconfirmation.model.User;
import com.microservice.mailconfirmation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping
public class ConfirmationController {

    @Autowired
    private UserService userService;

    @PostMapping("temp/confirm")
    public User persistUserConfirmation(@RequestBody User userConfirmation) {
        return userService.persistUserConfirmation(userConfirmation);
    }

    @PostMapping("confirm")
    public User confirmEmail(@RequestBody Confirm confirmation) {
        return userService.confirmEmail(confirmation);
    }
}
