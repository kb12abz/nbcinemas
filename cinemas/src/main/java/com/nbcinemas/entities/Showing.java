/**
 * 
 */
package com.nbcinemas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author kieranbagnall
 *
 */
@Entity
@Table (name = "Showing")
public class Showing {
	
	@Id
	@Column (name = "showingID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
	private int showingID;
	
	@ManyToOne
	private Location location;
	
	@ManyToOne
	private Screen screen;
	
	@ManyToOne
	private Film film;
	
	@Column (name = "dateOfShowing")
	private Date dateOfShowing;
	
	@Column (name = "timeOfShowing")
	private String timeOfShowing;
	
	public Showing(){}
	
	public Showing(int id, Location location, Screen screen, Film film, Date date, String time){
		this.showingID = id;
		this.location = location;
		this.screen = screen;
		this.film = film;
		this.dateOfShowing = date;
		this.timeOfShowing = time;
	}
	
	public Showing(Location location, Screen screen, Film film, Date date, String time){
		this.location = location;
		this.screen = screen;
		this.film = film;
		this.dateOfShowing = date;
		this.timeOfShowing = time;
	}

	/**
	 * @return the showingID
	 */
	public int getShowingID() {
		return showingID;
	}

	/**
	 * @param showingID the showingID to set
	 */
	public void setShowingID(int showingID) {
		this.showingID = showingID;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * @return the screen
	 */
	public Screen getScreen() {
		return screen;
	}

	/**
	 * @param screen the screen to set
	 */
	public void setScreen(Screen screen) {
		this.screen = screen;
	}

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

	/**
	 * @return the dateOfShowing
	 */
	public Date getDateOfShowing() {
		return dateOfShowing;
	}

	/**
	 * @param dateOfShowing the dateOfShowing to set
	 */
	public void setDateOfShowing(Date dateOfShowing) {
		this.dateOfShowing = dateOfShowing;
	}

	/**
	 * @return the timeOfShowing
	 */
	public String getTimeOfShowing() {
		return timeOfShowing;
	}

	/**
	 * @param timeOfShowing the timeOfShowing to set
	 */
	public void setTimeOfShowing(String timeOfShowing) {
		this.timeOfShowing = timeOfShowing;
	}
}
