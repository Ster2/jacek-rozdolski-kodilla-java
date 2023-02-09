package com.kodilla.good.patterns.Food2Door;

public class Customer {
    private String name;
    private String surname;
    private String phoneNum;
    private String adress;

    public Customer(String name, String surname, String phoneNum, String adress) {
        this.name = name;
        this.surname = surname;
        this.phoneNum = phoneNum;
        this.adress = adress;
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

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
