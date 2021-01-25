package com.booklibrary.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subscription {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SUBSCRIPTION_ID")
	private String id;

	@Column(name = "SUBSCRIBER_NAME")
	private String subscriberName;

	@Column(name = "DATE_SUBSCRIBED")
	private String subscribedDate;

	@Column(name = "DATE_RETURNED")
	private Date returnedDate;

	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "BOOK_ID", nullable = false)
	private Book parentBook;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public String getSubscribedDate() {
		return subscribedDate;
	}

	public void setSubscribedDate(String subscribedDate) {
		this.subscribedDate = subscribedDate;
	}

	public Date getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}

	public Book getParentBook() {
		return parentBook;
	}

	public void setParentBook(Book parentBook) {
		this.parentBook = parentBook;
	}

}
