package com.microservice.mailconfirmation.interfaces;

import com.microservice.mailconfirmation.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:8080/" , name = "register")
public interface Confirmation {

    @PostMapping("pwe/register")
    User confirmEmail(@RequestBody User user);
}
