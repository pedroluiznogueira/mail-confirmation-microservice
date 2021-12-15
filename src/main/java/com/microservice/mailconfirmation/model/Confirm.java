package com.microservice.mailconfirmation.model;

public class Confirm {

    private String username;

    public Confirm() {
    }

    public Confirm(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
