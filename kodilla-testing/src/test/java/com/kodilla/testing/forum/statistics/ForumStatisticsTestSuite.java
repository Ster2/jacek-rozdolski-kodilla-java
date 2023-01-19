package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;

    @BeforeEach
    public void before(){
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Test
    void testCalculateAdvStatisticsPosts0(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostsNumber());
    }

    @Test
    void testCalculateAdvStatisticsPosts1000(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsNumber());
    }

    @Test
    void testCalculateAdvStatisticsComments0(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsNumber());
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getCommentsNumber());
        assertEquals(10, forumStatistics.getPostsNumber());
    }

    @Test
    void testCalculateAdvStatisticsMorePostsThanComments(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(15);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(50,forumStatistics.getPostsNumber());
        assertEquals(15, forumStatistics.getCommentsNumber());
    }

    @Test
    void testCalculateAdvStatisticsZeroUsers(){
        //Given
        List<String> usersList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.usersNames().size());
    }

    @Test
    void testCalculateAdvStatistics100Users(){
        //Given
        List<String> userList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            userList.add("User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersNumber());
    }
}