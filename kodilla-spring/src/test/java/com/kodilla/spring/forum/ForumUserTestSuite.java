package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.getUserName();

        //Then
        Assert.assertEquals("John Smith", name);
    }
}