package com.booklibrary.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booklibrary.entity.Book;
import com.booklibrary.repositry.BookRespository;

@Service
public class BookService {

	@Autowired
	BookRespository bookRepository;

	public List<Book> getBooks() {
		
		return bookRepository.findAll();
	}

	
}
