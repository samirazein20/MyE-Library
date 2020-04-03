package com.myelibrary.library.services;

import com.myelibrary.library.model.BookCopy;

import java.util.List;

public interface BookCopyService {
    BookCopy saveBookCopy(BookCopy bookCopy);

    List<BookCopy> findAllById(Iterable<Long> bookCopyId);

    List<BookCopy> findAll();

    void deleteInBatch(Iterable<Long> bookCopyId);

    void deleteAllInBatch();

    BookCopy getOneBookCopy(Long bookCopyId);
}
