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
@Table (name = "Screen")
public class Screen {
	
	@Id
	@Column (name = "screenID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
	private int screenID;
	
	@Column(name = "numberOfSeats")
	private int numberOfSeats;
	
	@OneToMany(mappedBy ="screen", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SELECT)
	private List<Seat> seats;
	
	@Column (name = "active")
	private boolean active;
	
	@Column (name = "deleted")
	private boolean deleted;
	
	public Screen(){}
	
	public Screen(int id, int number, List<Seat> seats){
		this.screenID = id;
		this.numberOfSeats = number;
		this.seats = seats;
		active = true;
		deleted = false;
	}
	
	public Screen(int number, List<Seat> seats){
		this.numberOfSeats = number;
		this.seats = seats;
		active = true;
		deleted = false;
	}

	/**
	 * @return the screenID
	 */
	public int getScreenID() {
		return screenID;
	}

	/**
	 * @param screenID the screenID to set
	 */
	public void setScreenID(int screenID) {
		this.screenID = screenID;
	}

	/**
	 * @return the numberOfSeats
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * @param numberOfSeats the numberOfSeats to set
	 */
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	/**
	 * @return the seats
	 */
	public List<Seat> getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
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
