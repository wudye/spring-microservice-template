package com.mwu.highcohesion;



public class UserMapper {

    public void addUser(User user) {
        System.out.printf("Adding user: %s", user);
    }

    public void updateUser(User supperUser) {
        System.out.printf("Updating user: %s", supperUser);
    }

}
