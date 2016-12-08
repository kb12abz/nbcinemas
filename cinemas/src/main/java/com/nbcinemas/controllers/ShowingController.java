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

import com.nbcinemas.service.FilmService;
import com.nbcinemas.service.LocationService;
import com.nbcinemas.service.ShowingService;

import com.nbcinemas.entities.Film;
import com.nbcinemas.entities.Location;
import com.nbcinemas.entities.Showing;

/**
 * @author kieranbagnall
 *
 */
@Named("showings")
@SessionScoped
public class ShowingController implements Serializable {

	@Inject
	private SelectedLocation selectedLocation;
	
	@Inject
	private SelectedFilm selectedFilm;
	
	@Inject 
	private FilmService filmService;
	
	@Inject
	private ShowingService showingService;
	
	@Inject
	private LocationController locationController;
	
	private List<Film> dataModel = null;
	private List<Showing> showingsForFilmAtLocation = null;
	
	public String reset(){
//		selectedLocation.setLocation(null);
//		dataModel = null;
//		getDataModel();
//		locationController.resetDataModel();
		return "index?faces-redirect=true";
	}
	
	public String allowRest(){
		String returnValue = "";
		if (selectedLocation.getLocation() != null){
			returnValue = "reset...show all cinema showings";
		}
		return returnValue;
	}
	
	public List<Film> getDataModel(){
		if (dataModel == null && selectedLocation.getLocation() == null){
			dataModel = filmService.findall();
		}
		else if (selectedLocation.getLocation() != null){
			System.out.println(selectedLocation.getLocation().getCinemasName());
			dataModel = null;
			List<Film> filmList = new ArrayList<Film>();
			for(Showing s : showingService.findByLocation(selectedLocation.getLocation().getCinemasName())){
				if (!filmList.contains(s.getFilm())){
					filmList.add(s.getFilm());
				}
			}
			dataModel = filmList;
		}
		return dataModel;
	}
	
	public void setDataModel(List<Film> filmList){
		dataModel = filmList;
	}
	
	public String view(Film film){
		String returnPage = "film?faces-redirect=true";
		selectedFilm.setFilm(film);
		getShowingDates();
		return returnPage;
	}
	
	public String getShowingDates(){
		String returValue = "Please select a location to view specific times!";
		if (selectedFilm.getFilm() != null && selectedLocation.getLocation() !=null){
			showingsForFilmAtLocation = showingService.getDatesOfFilm(selectedFilm.getFilm(), selectedLocation.getLocation());
				if (showingsForFilmAtLocation.size() == 0){
					returValue = "Film isnt currently scheduled at this location";
				}
				else{
					returValue = "";
				}
		}
		return returValue;
	}

	/**
	 * @return the showingsForFilmAtLocation
	 */
	public List<Showing> getShowingsForFilmAtLocation() {
		return showingsForFilmAtLocation;
	}

	/**
	 * @param showingsForFilmAtLocation the showingsForFilmAtLocation to set
	 */
	public void setShowingsForFilmAtLocation(List<Showing> showingsForFilmAtLocation) {
		this.showingsForFilmAtLocation = showingsForFilmAtLocation;
	}
	

}
