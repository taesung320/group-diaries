package com.example.demo.user;

public class UserModel {
    int id;
    String name;
    String initial;
    String color;
    String password;
    String email;

    public UserModel() {
    }

    public UserModel(int id, String name, String initial, String color, String password, String email) {
        this.id = id;
        this.name = name;
        this.initial = initial;
        this.color = color;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
