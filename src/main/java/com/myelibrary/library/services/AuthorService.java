package com.myelibrary.library.services;

import com.myelibrary.library.model.Author;

import java.util.List;

public interface AuthorService {
    Author saveAuthor(Author author);

    List<Author> findAllById(Iterable<Long> authorId);

    List<Author> findAll();

    void deleteInBatch(Iterable<Long> authorId);

    void deleteAllInBatch();

    Author getOneAuthor(Long authorId);
}
