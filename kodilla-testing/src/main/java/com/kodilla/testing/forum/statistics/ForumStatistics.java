package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsOnUser;
    private double averageCommentsOnUser;
    private double averageCommentsOnPosts;


    List<String> usersNames(){
        List<String> userList = new ArrayList<>();
        return userList;
    }

    public int postsCount(){
        return postsNumber;
    }

    public int commentsCount(){
        return  commentsNumber;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        if(usersNumber > 0){
            double temporaryUsersNumber = usersNumber;
            averagePostsOnUser = postsNumber / temporaryUsersNumber;
            averageCommentsOnUser = commentsNumber/temporaryUsersNumber;
        } else{
            averagePostsOnUser = 0;
            averageCommentsOnUser = 0;
        }
        if (postsNumber > 0){
            double temporaryPostsNumber = postsNumber;
            averageCommentsOnPosts = commentsNumber/temporaryPostsNumber;
        } else{
            averageCommentsOnPosts = 0;
        }
    }

    public void showStatistics(Statistics statistics){
        System.out.println("Statistics of forum:");
        System.out.println("Users on forum: " + usersNumber);
        System.out.println("Posts on forum: " + postsNumber);
        System.out.println("Comments on forum: " + commentsNumber);
        System.out.println("Average posts on one user: " + averagePostsOnUser);
        System.out.println("Average comments on one user: " + averageCommentsOnUser);
        System.out.println("Average comments on one post: " + averageCommentsOnPosts);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsOnUser() {
        return averagePostsOnUser;
    }

    public double getAverageCommentsOnUser() {
        return averageCommentsOnUser;
    }

    public double getAverageCommentsOnPosts() {
        return averageCommentsOnPosts;
    }
}