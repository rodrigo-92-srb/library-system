package model.entities;

public class Book {
	
	private String title;
	
	private Author author;
	
	private Genre genre;
	
	private int releaseYear;
	
	public Book(String title, Author author, Genre genre, int releaseYear) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseDate(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
}