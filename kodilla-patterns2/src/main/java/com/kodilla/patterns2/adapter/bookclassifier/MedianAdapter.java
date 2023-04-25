package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature,Book> bookMap = new HashMap<>();
        Iterator<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> iterator = bookSet.iterator();
        while(iterator.hasNext()){
            com.kodilla.patterns2.adapter.bookclassifier.librarya.Book theBook = iterator.next();

            bookMap.put(new BookSignature(theBook.getSignature()),
                    new Book(theBook.getAuthor(),theBook.getTitle(),theBook.getPublicationYear()));
        }

        return medianPublicationYear(bookMap);
    }
}