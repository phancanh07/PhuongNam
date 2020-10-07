package com.example.phuongnam.model;

public class User {

    public String Username;
    public String Password;
    public String Email;
    public String soDT;

    public User() {
    }

    public User(String username, String password, String email, String soDT) {
        Username = username;
        Password = password;
        Email = email;
        this.soDT = soDT;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
}