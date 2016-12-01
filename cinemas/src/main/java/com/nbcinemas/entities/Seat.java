/**
 * 
 */
package com.nbcinemas.entities;

import java.beans.ConstructorProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 * @author kieranbagnall
 *
 */

@Entity
@Table (name = "Seat")
public class Seat {
	
	@Id
	@Column (name = "seatID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int seatID;
	
	@Column(name = "row")
	private String row;
	
	@Column(name = "number")
	private int number;
	
	@Column(name = "occupied")
	private boolean occupied;
	
	@ManyToOne
	@JoinColumn(name="screen_id")
	private Screen screen;
	
	@Column (name = "deleted")
	private boolean deleted;
	
	public Seat(){}
	
	public Seat(int id, String row, int number, boolean occupied, Screen screen){
		this.seatID = id;
		this.row = row;
		this.number = number;
		this.occupied = occupied;
		this.screen = screen;
		deleted = false;
	}
	
	public Seat(String row, int number, boolean occupied, Screen screen){
		this.row = row;
		this.number = number;
		this.occupied = occupied;
		this.screen = screen;
		deleted = false;
	}

	/**
	 * @return the seatID
	 */
	public int getSeatID() {
		return seatID;
	}

	/**
	 * @param seatID the seatID to set
	 */
	public void setSeatID(int seatID) {
		this.seatID = seatID;
	}

	/**
	 * @return the row
	 */
	public String getRow() {
		return row;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(String row) {
		this.row = row;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the occupied
	 */
	public boolean isOccupied() {
		return occupied;
	}

	/**
	 * @param occupied the occupied to set
	 */
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
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
