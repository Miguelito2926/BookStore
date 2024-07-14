package com.ednaldotavares.bookstore.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Author implements Serializable {
    private static final long serialVerionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
