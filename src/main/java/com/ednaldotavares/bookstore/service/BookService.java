package com.ednaldotavares.bookstore.service;


import com.ednaldotavares.bookstore.dto.BookDTO;
import com.ednaldotavares.bookstore.dto.MessageResponseDTO;
import com.ednaldotavares.bookstore.entities.Book;
import com.ednaldotavares.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public MessageResponseDTO insert(BookDTO bookDTO) {
//        Book bookToSave = bookMapper.toModel(bookDTO);
        Book book = new Book(bookDTO);
        Book savedBook = bookRepository.save(book);

        return MessageResponseDTO.builder()
                .message("Book created with ID: " + savedBook.getId())
                .build();
    }
}
