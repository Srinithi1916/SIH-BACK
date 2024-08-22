package com.example.demo.controller;

public class SignupRequest {
    private String userType; // This should be "Admin" or "Normal User"
    private String name;
    private String damName;
    private String state;
    private String govtId;
    private String email;
    private String phoneNumber;
    private String password;
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDamName() {
        return damName;
    }
    public void setDamName(String damName) {
        this.damName = damName;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getGovtId() {
        return govtId;
    }
    public void setGovtId(String govtId) {
        this.govtId = govtId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Getters and Setters
}
