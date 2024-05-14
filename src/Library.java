import java.text.ParseException;

import model.entities.Author;
import model.entities.Book;
import model.entities.Genre;
import model.entities.Role;
import model.entities.User;

public class Library {

	public static void main(String[] args) throws ParseException {
		
		
		Author author1 = new Author("Dan Brown", "22/06/1964", "USA");

		Book book1 = new Book("Digital Fortress", author1, Genre.Adventure, 2008);
		
		User user1 = new User("Sam Tarly", Role.Student);
		
		System.out.println("------------- Citadel Library --------------");
		System.out.println("--------------------------------------------");
		System.out.println("Author: "+author1.getName()+"\nBirth: "+author1.getBirthDate()+"\nCountry: "+author1.getCountry());
		System.out.println("--------------------------------------------");
		System.out.println("Book: "+book1.getTitle()+"\nAuthor: "+book1.getAuthor().getName()+"\nGenre: "+book1.getGenre()+"\nRelease: "+book1.getReleaseYear());
		System.out.println("--------------------------------------------");
		System.out.println("User \nID: "+user1.getID()+"\nName: "+user1.getName()+"\nRole: "+user1.getRole());
		System.out.println("--------------------------------------------");
		
	}

}
