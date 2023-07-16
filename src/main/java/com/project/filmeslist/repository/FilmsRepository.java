package com.project.filmeslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.filmeslist.entities.Films;

public interface FilmsRepository extends JpaRepository<Films, Long> {
	
}
