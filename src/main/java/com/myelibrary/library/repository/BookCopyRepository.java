package com.myelibrary.library.repository;

import com.myelibrary.library.model.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {
}
