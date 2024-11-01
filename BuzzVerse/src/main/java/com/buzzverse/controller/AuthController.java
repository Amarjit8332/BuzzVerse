package com.buzzverse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.buzzverse.entity.User;
import com.buzzverse.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return "User registered successfully!";
    }

    @PostMapping("/login/request-otp")
    public String requestOtp(@RequestParam String firstName, @RequestParam String phoneNumber) {
        String otp = userService.generateAndSaveOtp(firstName, phoneNumber);
        // Here, you would send OTP to the user's phone via SMS API
        return "OTP sent to your phone number.";
    }

    @PostMapping("/login/verify-otp")
    public String verifyOtp(@RequestParam String phoneNumber, @RequestParam String otp) {
        boolean isValid = userService.validateOtp(phoneNumber, otp);
        return isValid ? "Login successful!" : "Invalid OTP.";
    }  // Added closing brace here
}
