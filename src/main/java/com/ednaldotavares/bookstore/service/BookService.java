package com.ednaldotavares.bookstore.service;

import com.ednaldotavares.bookstore.dto.MessageResponseDTO;
import com.ednaldotavares.bookstore.entities.Book;
import com.ednaldotavares.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public MessageResponseDTO insert(Book book){
        book = bookRepository.save(book);

        return  MessageResponseDTO.builder()
                .message("Book created with ID: " + book.getId())
                .build();
    }
}
