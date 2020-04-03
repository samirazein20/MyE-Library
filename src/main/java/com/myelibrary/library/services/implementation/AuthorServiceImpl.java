package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Author;
import com.myelibrary.library.repository.AuthorRepository;
import com.myelibrary.library.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> findAllById(Iterable<Long> authorId) {
        return authorRepository.findAllById(authorId);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> authorId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Author getOneAuthor(Long authorId) {
        return authorRepository.getOne(authorId);
    }
}
