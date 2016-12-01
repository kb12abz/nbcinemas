/**
 * 
 */
package com.nbcinemas.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author kieranbagnall
 *
 */

@Entity
@Table(name = "Film")
public class Film {

	@Id
	@Column(name = "filmID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int filmID;

	@Column(name = "name")
	private String filmName;

	@Column(name = "rating")
	private int rating;

	@Column(name = "description")
	private String description;

	@Column(name = "imagePath")
	private String imagePath;

	@Column(name = "lastViewingDate")
	private Date lastViewingDate;

	
	@Column (name = "deleted")
	private boolean deleted;
	
	public Film() {
	}

	public Film(int id, String filmName, int rating, String description, String imagePath, Date lastViewingDate) {
		this.filmID = id;
		this.filmName = filmName;
		this.rating = rating;
		this.description = description;
		this.imagePath = imagePath;
		this.lastViewingDate = lastViewingDate;
		deleted = false;
	}

	public Film(String filmName, int rating, String description, String imagePath, Date lastViewingDate) {
		this.filmName = filmName;
		this.rating = rating;
		this.description = description;
		this.imagePath = imagePath;
		this.lastViewingDate = lastViewingDate;
		deleted = false;
	}

	/**
	 * @return the filmID
	 */
	public int getFilmID() {
		return filmID;
	}

	/**
	 * @param filmID
	 *            the filmID to set
	 */
	public void setFilmID(int filmID) {
		this.filmID = filmID;
	}

	/**
	 * @return the filmName
	 */
	public String getFilmName() {
		return filmName;
	}

	/**
	 * @param filmName
	 *            the filmName to set
	 */
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath
	 *            the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	/**
	 * @return the lastViewingDate
	 */
	public Date getLastViewingDate() {
		return lastViewingDate;
	}

	/**
	 * @param lastViewingDate the lastViewingDate to set
	 */
	public void setLastViewingDate(Date lastViewingDate) {
		this.lastViewingDate = lastViewingDate;
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
