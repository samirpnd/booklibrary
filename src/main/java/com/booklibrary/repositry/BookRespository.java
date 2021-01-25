package com.booklibrary.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booklibrary.entity.Book;


public interface BookRespository extends JpaRepository<Book, String> {
	
	// List<Book> findAll();
}
