/**
 * 
 */
package com.nbcinemas.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author kieranbagnall
 *
 */
@Entity
@Table(name = "WatchList")
public class WatchList {

	@Id
	@Column(name = "watchListID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int watchListID;

	@OneToMany(mappedBy = "watchList", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SELECT)
	private List<Film> films;

	@Column(name = "deleted")
	private boolean deleted;

	public WatchList() {
		deleted = false;
	}

	/**
	 * @return the watchListID
	 */
	public int getWatchListID() {
		return watchListID;
	}

	/**
	 * @param watchListID
	 *            the watchListID to set
	 */
	public void setWatchListID(int watchListID) {
		this.watchListID = watchListID;
	}

	/**
	 * @return the films
	 */
	public List<Film> getFilms() {
		return films;
	}

	/**
	 * @param films
	 *            the films to set
	 */
	public void addFilm(Film film) {
		films.add(film);
	}

	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * @param deleted
	 *            the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * @param films
	 *            the films to set
	 */
	public void setFilms(List<Film> films) {
		this.films = films;
	}
}
