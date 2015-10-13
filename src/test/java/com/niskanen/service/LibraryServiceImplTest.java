package com.niskanen.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.SelectBeforeUpdate;
import org.junit.Before;
import org.junit.Test;

import com.niskanen.model.Movie;

public class LibraryServiceImplTest {

	LibraryServiceImpl target;

	@Before
	public void setup(){
		target = new LibraryServiceImpl();
	}
		
	@Test
	public void checkFindAllReturnsList() {
		assertTrue(List.class.isInstance(target.findAll()));
	}

	@Test
	public void testLibraryNotZeroAfterAdd(){
		Movie movie = new Movie();
		target.addMovie(movie);
		
		assertTrue(target.findAll().size()==1);
	}
}
