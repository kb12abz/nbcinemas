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

/**
 * @author kieranbagnall
 *
 */
@Entity
@Table (name = "WatchListDetails")
public class WatchListDetails {
	
	@Id
	@Column (name = "watchListDetailsID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
	private int watchListDetailsID;
	
	@ManyToOne
	private Film film;
	
	@ManyToOne
	private WatchList watchList;
	
	public WatchListDetails(){}
	
	public WatchListDetails(Film film){
		this.film = film;
	}

	/**
	 * @return the watchListDetailsID
	 */
	public int getWatchListDetailsID() {
		return watchListDetailsID;
	}

	/**
	 * @param watchListDetailsID the watchListDetailsID to set
	 */
	public void setWatchListDetailsID(int watchListDetailsID) {
		this.watchListDetailsID = watchListDetailsID;
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
	 * @return the watchList
	 */
	public WatchList getWatchList() {
		return watchList;
	}

	/**
	 * @param watchList the watchList to set
	 */
	public void setWatchList(WatchList watchList) {
		this.watchList = watchList;
	}
}
