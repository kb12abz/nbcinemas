/**
 * 
 */
package com.nbcinemas.entities;

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
@Table (name = "Film")
public class Film {

	@Id
	@Column (name = "filmID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int filmID;
	
	
	@Column (name = "name")
	private String filmName;
	
	@Column (name = "rating")
	private int rating;
	
	@Column (name = "description")
	private String description;
	
	@Column (name = "imagePath")
	private String imagePath;
	
	public Film(){}
	
	public Film(int id, String filmName, int rating, String description, String imagePath){
		this.filmID = id;
		this.filmName = filmName;
		this.rating = rating;
		this.description = description;
		this.imagePath = imagePath;
	}
	
	public Film(String filmName, int rating, String description, String imagePath){
		this.filmName = filmName;
		this.rating = rating;
		this.description = description;
		this.imagePath = imagePath;
	}

	/**
	 * @return the filmID
	 */
	public int getFilmID() {
		return filmID;
	}

	/**
	 * @param filmID the filmID to set
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
	 * @param filmName the filmName to set
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
	 * @param rating the rating to set
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
	 * @param description the description to set
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
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
