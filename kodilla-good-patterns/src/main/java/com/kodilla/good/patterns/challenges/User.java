package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String phoneNum;

    public User(String name, String surname, String phoneNum) {
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}