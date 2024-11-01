package com.buzzverse.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.buzzverse.Util.OtpUtil;
import com.buzzverse.entity.User;
import com.buzzverse.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            throw new IllegalArgumentException("Passwords do not match");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public String generateAndSaveOtp(String firstName, String phoneNumber) {
        Optional<User> userOpt = userRepository.findByFirstNameAndPhoneNumber(firstName, phoneNumber);
        if (userOpt.isPresent()) {
            String otp = OtpUtil.generateOtp();
            User user = userOpt.get();
            user.setOtp(otp);
            userRepository.save(user);
            return otp; // In production, send via SMS
        } else {
            throw new RuntimeException("User not found");
        }
    }

    public boolean validateOtp(String phoneNumber, String otp) {
        Optional<User> userOpt = userRepository.findByPhoneNumber(phoneNumber);
        return userOpt.map(user -> otp.equals(user.getOtp())).orElse(false);
    }
}
