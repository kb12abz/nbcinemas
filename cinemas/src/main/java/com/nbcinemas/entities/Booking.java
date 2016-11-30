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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author kieranbagnall
 *
 */
@Entity
@Table (name = "Booking")
public class Booking {

	@Id
	@Column (name = "bookingID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
	private int bookingID;
	
	@Column (name = "dateOfBooking")
	private Date dateOfBooking;
	
	@ManyToOne
	private Customer customer;
	
	@Column (name = "totalCost")
	private double totalCost;
	
	public Booking(){}
	
	public Booking(int id, Date date, Customer customer, double cost){
		this.bookingID = id;
		this.dateOfBooking = date;
		this.customer = customer;
		this.totalCost = cost;
	}
	
	public Booking(Date date, Customer customer, double cost){
		this.dateOfBooking = date;
		this.customer = customer;
		this.totalCost = cost;
	}

	/**
	 * @return the bookingID
	 */
	public int getBookingID() {
		return bookingID;
	}

	/**
	 * @param bookingID the bookingID to set
	 */
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	/**
	 * @return the dateOfBooking
	 */
	public Date getDateOfBooking() {
		return dateOfBooking;
	}

	/**
	 * @param dateOfBooking the dateOfBooking to set
	 */
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
}
