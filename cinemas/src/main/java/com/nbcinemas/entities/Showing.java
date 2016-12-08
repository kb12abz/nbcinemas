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

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	private Calendar dateOfShowing;
	
	@Column (name = "timeOfShowing")
	private String timeOfShowing;
	
	@Column (name = "deleted")
	private boolean deleted;
	
	public Showing(){}
	
	public Showing(int id, Location location, Screen screen, Film film, Calendar date, String time){
		this.showingID = id;
		this.location = location;
		this.screen = screen;
		this.film = film;
		this.dateOfShowing = date;
		this.timeOfShowing = time;
		deleted = false;
	}
	
	public Showing(Location location, Screen screen, Film film, Calendar date, String time){
		this.location = location;
		this.screen = screen;
		this.film = film;
		this.dateOfShowing = date;
		this.timeOfShowing = time;
		deleted = false;
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
	public String getDateOfShowing() {
		Calendar cal = dateOfShowing;
		SimpleDateFormat format1 = new SimpleDateFormat("EEE dd MMM");
		String formatted = format1.format(cal.getTime());
		return formatted;
	}

	/**
	 * @param dateOfShowing the dateOfShowing to set
	 */
	public void setDateOfShowing(Calendar dateOfShowing) {
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

	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
