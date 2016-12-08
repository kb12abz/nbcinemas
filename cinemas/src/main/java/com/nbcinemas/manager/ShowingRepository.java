/**
 * 
 */
package com.nbcinemas.manager;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.nbcinemas.entities.Film;
import com.nbcinemas.entities.Location;
import com.nbcinemas.entities.Screen;
import com.nbcinemas.entities.Showing;

/**
 * @author kieranbagnall
 *
 */
public interface ShowingRepository {

	// Create
	public void persistShowing(Location location, Screen screen, Film film, Calendar date, String time);

	// Retrieve
	public Showing getShowingById(int id);

	public List<Showing> getShowingsByLocation(String location);
	
	public List<Showing> findAll();
	// Update
	public void updateLocation(Location location, int id);

	public void updateScreen(Screen screen, int id);

	public void updateFil(Film film, int id);

	public void updateDateOfShowing(Calendar date, int id);

	public void updateTimeOfShowing(String time, int id);

	// Delete
	public void deleteShowing(int id);

}
