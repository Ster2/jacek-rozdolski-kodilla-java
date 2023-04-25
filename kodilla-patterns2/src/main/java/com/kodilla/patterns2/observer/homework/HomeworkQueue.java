package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {
    private final List<Observer> cursantList;
    private final List<String> homeworks;
    private final String name;

    public HomeworkQueue(String name) {
        this.cursantList = new ArrayList<>();
        this.homeworks = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        cursantList.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : cursantList) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        cursantList.remove(observer);
    }
}