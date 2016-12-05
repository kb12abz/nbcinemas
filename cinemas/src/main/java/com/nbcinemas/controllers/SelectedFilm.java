/**
 * 
 */
package com.nbcinemas.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.nbcinemas.entities.Film;

/**
 * @author kieranbagnall
 *
 */
@Named("selectedFilm")
@SessionScoped
public class SelectedFilm implements Serializable {

	private Film film;

	/**
	 * @return the film
	 */
	public Film getFilm() {
		return film;
	}

	/**
	 * @param film the film to set
	 */
	public void setFilm(Film film) {
		this.film = film;
	}	
}
