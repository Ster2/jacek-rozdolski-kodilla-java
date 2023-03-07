package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Things which are need to be done until monday";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("To do", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> findName = taskListDao.findByListName(listName);

        //Then
        assertEquals(1, findName.size());

        //CleanUp
        int id = findName.get(0).getId();
        taskListDao.deleteById(id);
    }
}