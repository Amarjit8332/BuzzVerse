package com.buzzverse.Util;

import java.util.Random;

public class OtpUtil {
    public static String generateOtp() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);  // Generates a 6-digit OTP
        return String.valueOf(otp);
    }  
}