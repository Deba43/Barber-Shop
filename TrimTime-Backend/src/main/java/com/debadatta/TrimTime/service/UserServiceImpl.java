package com.debadatta.TrimTime.service;

import com.debadatta.TrimTime.dto.User;
import com.debadatta.TrimTime.dto.UserRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User registerUser(UserRegistrationRequest userRegistrationRequest) {
        // Implement user registration logic here
        return new User(); // Replace with actual implementation
    }

    @Override
    public User loginUser(String mobile_number, String otp) {
        // Implement user login logic here
        return new User(); // Replace with actual implementation
    }
}
