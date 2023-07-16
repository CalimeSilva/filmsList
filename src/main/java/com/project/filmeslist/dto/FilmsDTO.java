package com.project.filmeslist.dto;

import org.springframework.beans.BeanUtils;

import com.project.filmeslist.entities.Films;


public class FilmsDTO {
	private Long id;
	private String title;
	private Double score;
	private Integer year;
	private String plataforma;
	private String imgUrl;
	private String description;

	public FilmsDTO() {
	}
	public FilmsDTO(Films films) {
		BeanUtils.copyProperties(films, this);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
