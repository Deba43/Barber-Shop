package com.debadatta.TrimTime.service;

import org.springframework.stereotype.Service;

import com.debadatta.TrimTime.dto.User;
import com.debadatta.TrimTime.dto.UserRegistrationRequest;

@Service
public interface UserService {
    User registerUser(UserRegistrationRequest userRegistrationRequest);

    User loginUser(String mobile_number, String otp);
}
