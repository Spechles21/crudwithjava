package com.example.CrudApplication.dto.request;

import lombok.Data;

@Data
public class BookDto {
private String title;
private String authorName;
private String body;
private Integer isbn;
   
}