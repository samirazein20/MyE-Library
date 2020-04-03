package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.BookCopy;
import com.myelibrary.library.repository.BookCopyRepository;
import com.myelibrary.library.services.BookCopyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookCopyServiceImpl implements BookCopyService {

    @Autowired
    BookCopyRepository bookCopyRepository;

    @Override
    public BookCopy saveBookCopy(BookCopy bookCopy) {
        return bookCopyRepository.save(bookCopy);
    }

    @Override
    public List<BookCopy> findAllById(Iterable<Long> bookCopyId) {
        return bookCopyRepository.findAllById(bookCopyId);
    }

    @Override
    public List<BookCopy> findAll() {
        return bookCopyRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> bookCopyId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BookCopy getOneBookCopy(Long bookCopyId) {
        return bookCopyRepository.getOne(bookCopyId);
    }
}
