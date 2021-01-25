package com.booklibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booklibrary.entity.Book;
import com.booklibrary.service.BookService;

@RestController
@RequestMapping("/booklibrary")
public class BookController {

	@Autowired
	BookService bookService;
		
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		
		List<Book> books = bookService.getBooks();
		if(!books.isEmpty()) {
			return new ResponseEntity<> (books, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
				
	}


}
