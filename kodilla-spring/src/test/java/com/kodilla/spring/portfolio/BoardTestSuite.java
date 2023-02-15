package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Board newBoard = (Board) context.getBean("createBoard");

        //When
        List<String> toDoList = (List<String>) newBoard.getToDoList().tasks;
        List<String> inProgressList = (List<String>) newBoard.getInProgressList().tasks;
        List<String> doneList = (List<String>) newBoard.getDoneList().tasks;

        toDoList.add("new task to do");
        inProgressList.add("new task in progress");
        doneList.add("new task done");

        toDoList.stream()
                .forEach(System.out::println);

        //Then
        Assert.assertTrue(toDoList.contains("new task to do"));
        Assert.assertTrue(inProgressList.contains("new task in progress"));
        Assert.assertTrue(doneList.contains("new task done"));
    }
}
