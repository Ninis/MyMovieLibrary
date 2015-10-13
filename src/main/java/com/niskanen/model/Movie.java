package com.niskanen.model;

import javax.persistence.Entity;

@Entity
public class Movie {
	private int id;
	private String name;
	private String tags;
	private String genre;
	private int publicationYear;
	private String location;

	public String getGenre() {
		return genre;
	}

	public int getId() {
		return id;
	}

	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public String getTags() {
		return tags;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}
}
