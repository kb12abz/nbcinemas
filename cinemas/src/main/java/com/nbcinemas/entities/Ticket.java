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
@Table (name = "Ticket")
public class Ticket {
	
	@Id
	@Column (name = "ticketID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
	private int ticketID;
	
	@ManyToOne
	private Booking booking;
	
	@ManyToOne
	private Showing showing;
	
	@ManyToOne
	private Seat seat;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "cost")
	private double cost;
	
	@Column (name = "deleted")
	private boolean deleted;
	
	public Ticket(){}
	
	public Ticket(int id, Booking booking, Showing showing, Seat seat, String type, int cost){
		this.ticketID = id;
		this.booking = booking;
		this.showing = showing;
		this.seat = seat;
		this.type =type;
		this.cost = cost;
		deleted = false;
	}
	
	public Ticket(Booking booking, Showing showing, Seat seat, String type, int cost){
		this.booking = booking;
		this.showing = showing;
		this.seat = seat;
		this.type =type;
		this.cost = cost;
		deleted = false;
	}

	/**
	 * @return the ticketID
	 */
	public int getTicketID() {
		return ticketID;
	}

	/**
	 * @param ticketID the ticketID to set
	 */
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}

	/**
	 * @return the booking
	 */
	public Booking getBooking() {
		return booking;
	}

	/**
	 * @param booking the booking to set
	 */
	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	/**
	 * @return the showing
	 */
	public Showing getShowing() {
		return showing;
	}

	/**
	 * @param showing the showing to set
	 */
	public void setShowing(Showing showing) {
		this.showing = showing;
	}

	/**
	 * @return the seat
	 */
	public Seat getSeat() {
		return seat;
	}

	/**
	 * @param seat the seat to set
	 */
	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
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
