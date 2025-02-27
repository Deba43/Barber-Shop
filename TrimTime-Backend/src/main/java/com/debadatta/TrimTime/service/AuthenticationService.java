package com.debadatta.TrimTime.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final CognitoService cognitoService;
    private final OtpService otpService;

    public AuthenticationService(CognitoService cognitoService, OtpService otpService) {
        this.cognitoService = cognitoService;
        this.otpService = otpService;
    }

    public void generateOtp(String mobileNumber) {
        String otp = otpService.generateOtp(mobileNumber);
        System.out.println("Your OTP is " + "- " + otp);
    }

    public void authenticate(String mobileNumber, String otp) {
        boolean isOtpValid = otpService.verifyOtp(mobileNumber, otp);
        if (!isOtpValid) {
            throw new RuntimeException("Invalid OTP for mobile number: " + mobileNumber);
        }
    }

    public String refreshAccessToken(String refreshToken) {
        return cognitoService.refreshToken(refreshToken);
    }
}
