package com.example.interview.model;

public class UserWithPassword extends UserWithoutPassword {
    private String password;

    public UserWithPassword(String username, String firstName, String lastName, String password) {
        super(username, firstName, lastName);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
