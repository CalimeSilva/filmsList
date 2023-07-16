package com.project.filmeslist.dto;

import com.project.filmeslist.entities.Films;


public class FilmsMinDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer year;
	private String imgUrl;
	
	public FilmsMinDTO() {
		
	}
	public FilmsMinDTO(Films films) {
		
		this.id = films.getId();
		this.title = films.getTitle();
		this.score = films.getScore();
		this.year = films.getYear();
		this.imgUrl = films.getImgUrl();
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Double getScore() {
		return score;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	
	
	
	
}
