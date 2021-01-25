package com.booklibrary.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booklibrary.entity.Book;
import com.booklibrary.entity.Subscription;


public interface SubscribeRespository extends JpaRepository<Subscription, String> {
	
	// List<Book> findAll();
}
