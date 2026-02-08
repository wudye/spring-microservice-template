package com.mwu.lowcohesion;



public class UserMapper {

    public void addUser(User user) {
        System.out.printf("Adding user: %s", user);
    }

    public void updateUser(User supperUser) {
        System.out.printf("Updating user: %s", supperUser);
    }

    public void validateEmail(User supperUser) {
        System.out.printf("Validating email for user: %s", supperUser.email());
    }

    public void sendEmail(User supperUser) {
        System.out.printf("Sending email to user: %s", supperUser.email());
    }
}
