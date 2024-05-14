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

	public void add(Lend lend) {
		// TODO Auto-generated method stub
		
	}

}