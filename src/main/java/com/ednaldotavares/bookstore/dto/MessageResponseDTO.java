package com.ednaldotavares.bookstore.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
@Builder
@Data

public class MessageResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String message;
}
