package com.nbcinemas.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.nbcinemas.entities.Film;
import com.nbcinemas.manager.FilmRepository;

@Stateless
public class FilmService {
	
	@Inject 
	private FilmRepository filmManager;
	
	
	public Integer getRating(int filmId){
		Film f = filmManager.getFilmByID(filmId);
		return f.getRating();		
	}
	
	public List<Film> findall() {
		List<Film> filmList = filmManager.findAll();
		return filmList;
	}

}
