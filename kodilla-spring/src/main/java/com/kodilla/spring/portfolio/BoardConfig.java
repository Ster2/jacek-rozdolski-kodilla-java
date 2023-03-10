package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList createDoneList() {
        return new TaskList();
    }

    @Bean
    public Board createBoard() {

        TaskList toDoList = createToDoList();
        TaskList inProgressList = createInProgressList();
        TaskList doneList = createDoneList();

        return new Board(toDoList, inProgressList, doneList);
    }

}