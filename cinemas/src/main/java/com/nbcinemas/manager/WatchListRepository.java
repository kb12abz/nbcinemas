/**
 * 
 */
package com.nbcinemas.manager;

import java.util.List;

import com.nbcinemas.entities.Film;

/**
 * @author kieranbagnall
 *
 */
public interface WatchListRepository {

	// Create
	public void persistWatchList();

	// Retrieve
	public List<Film> getFilmsInWatchList(int id);

	// Update
	public void addFilm(Film film, int id);

	public void removeFilm(Film film, int id);

	// Delete
	public void deleteWatchList(int id);

}
