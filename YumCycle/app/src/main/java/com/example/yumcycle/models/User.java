// User.java
package com.example.yumcycle.models;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;

    // Constructors
    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(Long userId) {
        this.id = userId.intValue();
    }

    public void setUser(User user) {
        this.username = user.getUsername();
    }

    public int getId() {
        return id;
    }
}
