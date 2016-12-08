/**
 * 
 */
package com.nbcinemas.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.nbcinemas.controllers.SelectedFilm;
import com.nbcinemas.controllers.SelectedLocation;
import com.nbcinemas.entities.Film;
import com.nbcinemas.entities.Location;
import com.nbcinemas.entities.Showing;
import com.nbcinemas.manager.FilmRepository;
import com.nbcinemas.manager.ShowingRepository;

/**
 * @author kieranbagnall
 *
 */
@Stateless
public class ShowingService {

	@Inject 
	private ShowingRepository showingManager;
	
//	@Inject
//	private SelectedFilm selectedFilm;
//	
//	@Inject
//	private SelectedLocation selectedLocation;
	
	
	public List<Showing> findall(){
		List<Showing> showingList = showingManager.findAll();
		return showingList;
	}
	
	public List<Showing> findByLocation(String location){
		List<Showing> showingList = showingManager.getShowingsByLocation(location);
		return showingList;
	}
	
	public List<Showing> getDatesOfFilm(Film f, Location l){
		System.out.println(f.getFilmName() + l.getCinemasName());
		List<Showing> showList = findByLocation(l.getCinemasName());
		List<Showing> showingsForFilmByLocation = new ArrayList<Showing>();
		for(Showing s : showList){
			if (s.getFilm().getFilmName().equals(f.getFilmName()))
			{
				showingsForFilmByLocation.add(s);
			}
		}
		return showingsForFilmByLocation;
	}
	
	
}
