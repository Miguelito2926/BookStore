package com.ednaldotavares.bookstore.repository;

import com.ednaldotavares.bookstore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
