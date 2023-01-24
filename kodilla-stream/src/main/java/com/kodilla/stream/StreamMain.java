package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<String, ForumUser> reasultListOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (user.getBirthDate().until(LocalDate.now(), ChronoUnit.YEARS)) > 20)
                .filter(user -> user.getPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));
        System.out.println("# elements: " + reasultListOfUsers.size());
        reasultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}