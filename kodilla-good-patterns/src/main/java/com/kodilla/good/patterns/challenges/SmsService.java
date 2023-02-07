package com.kodilla.good.patterns.challenges;

public class SmsService implements InformationService {
    @Override
    public void inform(User user) {
        String phoneNumber = user.getPhoneNum();
        System.out.println("Sending message to " + phoneNumber + " - \"Your order is preparing\"");
    }
}