package com.example.CrudApplication.controller;


import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

// import java.util.ArrayList;
// import java.util.Optional;

// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.sterotype.controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudApplication.dto.request.BookDto;
import com.example.CrudApplication.model.Book;
// import com.example.CrudApplication.model.Book;
import com.example.CrudApplication.service.BookService;


@RestController
@RequestMapping("/api/book")
public class BookController {
        @Autowired
    private BookService bookService;

@GetMapping("/getAllBooks")
public Object getAllBooks(){
return bookService.getAllBooks();
}


@GetMapping("/getBookById/{id}")
public Object getBookById(@PathVariable Long id) {
    Object bookData = bookService.getBookById(id);
    if (bookData != null){
    return bookData;
    }
   return "BOOK NOT FOUND!!";
    }


    @PostMapping("/createBook")
    public Book addBook(@RequestBody BookDto book) {
        return bookService.saveBook(book);
    }

//    @PutMapping("/{id}")
//     public Item updateBook(@PathVariable Long id, @RequestBody Book book) {
//         book.setId(id);
//         return bookService.saveBook(book);
//     }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "BOOK DELETED SUCESSFULLY!!!";
    }


}


















//    @PostMapping("/addBook")
    
//     public void addBook(@RequestBody Book book) {
//     Book bookObj = bookRepo.save(book);
   
//  return new ResponseEntity <>  (bookObj, HttpStatus.OK);
//  }
// @PostMapping("/updateBookById/{id}")
// public void updateBookById(@PathVariable Long id, @RequestBody Book  newBookData){
//     Optional <Book> oldBookData = bookRepo.findById(id);
//     if(oldBookData.isPresent())   {
//         Book updatedBookData = oldBookData.get();
// updatedBookData.setTitle(newBookData.getTitle());
// updatedBookData.setAuthor(newBookData.getAuthor());
// BookRepo.save(updatedBookData);
// return new ResponseEntity<>(bookObj, HttpStatus.OK);
// }
// return new ResponseEntity<>(HttpStatus.NOT_FOUND);

 
// @DeleteMapping
// public void deleteBookById(@PathVariable Long id){
// bookRepo.deleteById(id);
// return new ResponseEntity<>(HttpStatus.OK);
// // return new ResponseEntity<>(HttpStatus.OK);

// }
// }


       




// @PostMapping("/updateBookById/{id}")
// public void updateBookById(@PathVariable Long id, @RequestBody Book newBookData) {
// Optional <Book> oldBookData.get();
// }
// }

// @DeleteMapping
// public void deleteBookById() {

// }
// }
    
   