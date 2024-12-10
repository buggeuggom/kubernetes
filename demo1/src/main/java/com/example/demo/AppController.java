package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Value("${MY_ACCOUNT:hwanginkyu42}")
    private String myAccount;

    @Value("${MY_PASSWORD:password1!}")
    private String myPassword;

    @GetMapping("/")
    public String home() {
        return "myAccount: " + myAccount + ", myPassword: " + myPassword;
    }
}