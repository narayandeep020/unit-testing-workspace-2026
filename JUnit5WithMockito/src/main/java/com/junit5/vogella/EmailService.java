package com.junit5.vogella;

public interface EmailService {

	boolean sendWelcomeEmail(String name, String email);

	boolean sendVerificationEmail(String email, String verificationCode);
}
