package com.project.filmeslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name="films_id")
	private Films films;
	@ManyToOne
	@JoinColumn(name="filmsList_id")
	private FilmsList filmsList;
	
	public BelongingPK () {
		
	}

	public BelongingPK(Films films, FilmsList filmsList) {
		super();
		this.films = films;
		this.filmsList = filmsList;
	}

	public Films getFilms() {
		return films;
	}

	public void setFilms(Films films) {
		this.films = films;
	}

	public FilmsList getFilmsList() {
		return filmsList;
	}

	public void setFilmsList(FilmsList filmsList) {
		this.filmsList = filmsList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(films, filmsList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(films, other.films) && Objects.equals(filmsList, other.filmsList);
	}
	
}
