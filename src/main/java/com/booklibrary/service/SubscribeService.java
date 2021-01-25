package com.booklibrary.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booklibrary.entity.Book;
import com.booklibrary.entity.Subscription;
import com.booklibrary.repositry.BookRespository;
import com.booklibrary.repositry.SubscribeRespository;

@Service
public class SubscribeService {

	@Autowired
	SubscribeRespository subscribeRepository;

	public List<Subscription> getSubscriptions() {
		
		return subscribeRepository.findAll();
	}

	
}
