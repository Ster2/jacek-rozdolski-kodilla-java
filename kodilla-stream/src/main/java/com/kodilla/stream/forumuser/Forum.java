package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    //konstruktor
    public Forum() {
        this.userList.add(new ForumUser("001", "Ardian Małecki", 'M', LocalDate.of(1990, 5, 15), 600));
        this.userList.add(new ForumUser("002", "Michał Kania", 'M', LocalDate.of(1999, 7, 2), 0));
        this.userList.add(new ForumUser("003", "Konrad Kowalski", 'M', LocalDate.of(2005, 2, 20), 450));
        this.userList.add(new ForumUser("004", "Anna Mucha", 'F', LocalDate.of(1999, 5, 19), 1450));
        this.userList.add(new ForumUser("005", "Kinga Wajs", 'F', LocalDate.of(2000, 8, 5), 751));
        this.userList.add(new ForumUser("006", "Lena Miałczyńska", 'F', LocalDate.of(1991, 4, 14), 141));
        this.userList.add(new ForumUser("007", "Mikołaj Krawczyk", 'M', LocalDate.of(1990, 5, 15), 500));
        this.userList.add(new ForumUser("008", "Aneta Zduńska", 'F', LocalDate.of(1991, 4, 14), 0));
    }

    //gettery
    public List<ForumUser> getUserList() {
        return userList;
    }
}