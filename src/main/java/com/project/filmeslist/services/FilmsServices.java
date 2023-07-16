package com.project.filmeslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.filmeslist.dto.FilmsMinDTO;
import com.project.filmeslist.entities.Films;
import com.project.filmeslist.repository.FilmsRepository;

@Service
public class FilmsServices {
	@Autowired
	private FilmsRepository filmsRepository;
	
	public List<FilmsMinDTO> findAll(){
		List<Films> reFilms= filmsRepository.findAll();
		List<FilmsMinDTO> dto = reFilms.stream().map(x->new FilmsMinDTO(x)).toList();
		return dto;
	}
}
