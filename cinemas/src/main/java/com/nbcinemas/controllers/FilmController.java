/**
 * 
 */
package com.nbcinemas.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.nbcinemas.entities.Film;
import com.nbcinemas.manager.FilmRepository;
import com.nbcinemas.service.FilmService;

import javax.faces.model.DataModel;

/**
 * @author kieranbagnall
 *
 */
@Named("films")
@SessionScoped
public class FilmController implements Serializable {

	@Inject
	private SelectedFilm selectedFilm;

	@Inject
	private FilmService filmService;

	public Integer getRating() {
		return filmService.getRating(selectedFilm.getFilm().getFilmID());
	}

}
