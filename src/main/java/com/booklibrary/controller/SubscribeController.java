package com.booklibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booklibrary.entity.Book;
import com.booklibrary.entity.Subscription;
import com.booklibrary.service.BookService;
import com.booklibrary.service.SubscribeService;

@RestController
@RequestMapping("/booklibrary")
public class SubscribeController {

	@Autowired
	SubscribeService subscribeService;
		
	@GetMapping("/subscriptions")
	public ResponseEntity<List<Subscription>> subscriptions() {
		
		List<Subscription> subscribes = subscribeService.getSubscriptions();
		
		if(!subscribes.isEmpty()) {
			return new ResponseEntity<>(subscribes, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}			
	}

}
