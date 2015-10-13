package com.niskanen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niskanen.model.Movie;
import com.niskanen.service.LibraryService;

@Controller
public class LibraryController {

	//@Autowired
	//private LibraryService libraryService;
	
	@RequestMapping(value="/addToLibrary")
	public String addToLibrary(@ModelAttribute ("movie") Movie movie){

		return "addToLibrary";
	}
	
	@RequestMapping(value="/library")
	public String getLibrary(){
		return "library";
	}
}