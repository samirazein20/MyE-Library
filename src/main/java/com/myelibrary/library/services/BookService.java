package com.myelibrary.library.services;

import com.myelibrary.library.model.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);

    List<Book> findAllById(Iterable<Long> bookId);

    List<Book> findAll();

    void deleteInBatch(Iterable<Long> bookId);

    void deleteAllInBatch();

    Book getOneBook(Long bookId);
}
