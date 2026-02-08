package com.mwu.highcohesion;

public class EmailManager {
    public void sendEmail(String email, String subject, String body) {
        System.out.printf("Sending email to: %s\nSubject: %s\nBody: %s\n", email, subject, body);
    }

     public void validateEmail(String email) {
        System.out.printf("Validating email: %s\n", email);
    }
}
