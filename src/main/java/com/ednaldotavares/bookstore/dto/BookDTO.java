package com.ednaldotavares.bookstore.dto;

import com.ednaldotavares.bookstore.entities.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO implements Serializable {
private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Integer pages;
    private Integer chapters;
    private String isbn;
    private String publisherName;
    private Author author;

}
