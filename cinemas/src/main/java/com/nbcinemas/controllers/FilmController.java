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
	
//	private DataModel<Film> dataModel = null;
	private List<Film> dataModel = null;
	
	public List<Film> getDataModel(){
		if (dataModel ==null){
			//dataModel = (DataModel<Film>) filmService.findall();
			dataModel = filmService.findall();
		}
		return dataModel;
	}
	
	public void setDataModel(List<Film> filmList){
		//dataModel = (DataModel<Film>) filmList;
		dataModel = filmList;
	}
	
	public String view(Film film){
		String returnPage = "film?faces-redirect=true";
		selectedFilm.setFilm(film);
		return returnPage;
	}
	
	

}
