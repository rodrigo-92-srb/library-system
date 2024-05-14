package services;

import java.util.Date;

import model.entities.Book;
import model.entities.Lend;
import model.entities.Status;
import model.entities.User;

public class LendService {
	
	public void lendBook(Book book, User user) {
		if(isUserAvailable(user)) {
			if (isBookAvailable(book)) {
	            Date dueDate = calculateDueDate();
	            Lend lend = new Lend(book, user, dueDate);
	            System.out.println(book.getTitle() + " is Available. Your Due Date is: " + dueDate);
	        } 
			else {
	            System.out.println("Sorry this book is not Available in this moment!");
	        }
		}
		else {
			System.out.println("Sorry "+user.getName()+"! You are not Available in this moment!");
		}
		
	}
	
	private boolean isUserAvailable(User user) {
		if(user.getStatus().equals(Status.Available)) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	private boolean isBookAvailable(Book book) {
		if(book.getStatus().equals(Status.Available)) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	private Date calculateDueDate() {
		// Adding 14 days in milliseconds
		return new Date(System.currentTimeMillis() + (14 * 24 * 60 * 60 * 1000));
	}

}