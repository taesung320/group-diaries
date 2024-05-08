package com.example.demo.user;

public class UserModel {
    int id;
    String name;
    int salary;
    String initial;
    String color;
    String password;
    String email;


    public UserModel(int id, String name, int salary, String initial, String color, String password, String email) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.initial = initial;
        this.color = color;
        this.password = password;
        this.email = email;
    }



    public UserModel() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getInitial() {
        return initial;
    }

    public String getColor() {
        return color;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
