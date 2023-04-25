package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> bookSet = new HashSet<>();
        Book book = new Book("Author1","Title1",2005,"123123");
        Book book2 = new Book("Author2","Title1",2010,"111111");
        Book book3 = new Book("Author3","Title1",2007,"122123");
        Book book4 = new Book("Author4","Title1",2000,"333333");
        Book book5 = new Book("Author5","Title1",2019,"555999");
        bookSet.add(book);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        //when
        int median = medianAdapter.publicationYearMedian(bookSet);
        //then
        assertEquals(2007,median,0);

    }


}