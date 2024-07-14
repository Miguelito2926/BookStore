package com.ednaldotavares.bookstore.contoller;

import com.ednaldotavares.bookstore.dto.MessageResponseDTO;
import com.ednaldotavares.bookstore.entities.Book;
import com.ednaldotavares.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
        return bookService.insert(book);
    }
}
