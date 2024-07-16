package com.ednaldotavares.bookstore.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AuthorDTO implements Serializable {

    private Long id;
    private String name;
    private Integer age;
}
