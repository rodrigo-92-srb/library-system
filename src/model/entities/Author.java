package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Author {

	private String name;
	
	private Date birthDate;
	
	private String country;
	
	public Author(String name, String birthDate, String country) throws ParseException {
		this.name = name;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		this.birthDate = dateFormat.parse(birthDate);
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(birthDate);
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}	
}