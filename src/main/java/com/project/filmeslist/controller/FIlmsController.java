package com.project.filmeslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.filmeslist.dto.FilmsMinDTO;
import com.project.filmeslist.entities.Films;
import com.project.filmeslist.services.FilmsServices;
@RestController
@RequestMapping(value="/films")
public class FIlmsController {
	@Autowired
	FilmsServices filmsServices;
	
	@GetMapping()
	public List<FilmsMinDTO> findAll(){
		return filmsServices.findAll();
	}
}
