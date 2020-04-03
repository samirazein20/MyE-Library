package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Book;
import com.myelibrary.library.repository.BookRepository;
import com.myelibrary.library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAllById(Iterable<Long> bookId) {
        return bookRepository.findAllById(bookId);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> bookId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Book getOneBook(Long bookId) {
        return bookRepository.getOne(bookId);
    }
}
