package com.nbcinemas.manager;

import java.util.Date;
import java.util.List;
import com.nbcinemas.entities.*;

/**
 * Interface for Product classes ProductManager will have these methods
 * 
 * @author Nibbles and Bytes
 */

public interface FilmRepository {
	// Create
	public void persistFilm(String filmName, int rating, String description, String imagePath, Date lastViewingDate);

	// Read
	public List<Film> getFilmByKeyword(String keyword);

	public Film getFilmByName(String name);

	public Film getFilmByID(int id);

	public Date getLastViewing(int id);

	public List<Film> findAll();

	// Update
	public void updateFilmName(String name, int id);

	public void updateFilmDescription(String description, int id);

	public void updateFilmImagePath(String imagePath, int id);

	// delete
	public void deleteFilm(int id);

}
