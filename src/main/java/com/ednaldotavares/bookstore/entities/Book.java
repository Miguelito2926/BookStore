package com.ednaldotavares.bookstore.entities;


import com.ednaldotavares.bookstore.dto.BookDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book  implements Serializable {
    private static final long serialVersioUID = 1L;


    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;

    //Mapeamento uni-direcional
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "author_id")
    private Author author;

    public Book(BookDTO bookDTO) {
        id = bookDTO.getId();
        name = bookDTO.getName();
        pages = bookDTO.getPages();
        chapters = bookDTO.getChapters();
        isbn = bookDTO.getIsbn();
        publisherName = bookDTO.getPublisherName();
        author = bookDTO.getAuthor();

    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public Book setPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    public Integer getChapters() {
        return chapters;
    }

    public Book setChapters(Integer chapters) {
        this.chapters = chapters;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Book setPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Book setAuthor(Author author) {
        this.author = author;
        return this;
    }

}
