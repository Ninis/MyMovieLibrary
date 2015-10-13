package com.niskanen.service;

import java.util.ArrayList;
import java.util.List;
import com.niskanen.model.Movie;

public class LibraryServiceImpl implements LibraryService {
	private List<Movie> library;

	public LibraryServiceImpl(){
		library = new ArrayList<Movie>();
	}
	
	public List<Movie> findAll() {
		return library;
	}

	public void addMovie(Movie movie) {
		library.add(movie);		
	}

}
