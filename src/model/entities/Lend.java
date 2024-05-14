package model.entities;

import java.util.Date;

public class Lend {
	
	private Book book;
	
	private User user;
	
	private Date dueDate;

	public Lend(Book book, User user, Date dueDate) {
		this.book = book;
		this.user = user;
		this.dueDate = dueDate;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}