package com.example.CrudApplication.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudApplication.dto.request.BookDto;
import com.example.CrudApplication.model.Book;
import com.example.CrudApplication.repo.BookRepo;
@Service
public class BookService {
@Autowired
private BookRepo bookRepo;

// ArrayList<Book> books = new ArrayList<>();

public List<Book> getAllBooks(){
    return bookRepo.findAll();
}

public Object getBookById(Long id){
    return bookRepo.findById(id);
}
public Book saveBook(BookDto book) {

    Book createdBook = new Book();
    createdBook.setAuthorName(book.getAuthorName());
    createdBook.setBody(book.getBody());
    createdBook.setIsbn(book.getIsbn());
    createdBook.setTitle(book.getTitle());
    Book theCreatedBook = bookRepo.save(createdBook);
    return theCreatedBook;
}

public void deleteBook(Long id) {
    bookRepo.deleteById(id);
}

}