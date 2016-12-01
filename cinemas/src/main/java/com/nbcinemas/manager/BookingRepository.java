/**
 * 
 */
package com.nbcinemas.manager;

import java.util.Date;

import com.nbcinemas.entities.Booking;
import com.nbcinemas.entities.Customer;

/**
 * @author kieranbagnall
 *
 */
public interface BookingRepository {

	// Create
	public void persistBooking(Date date, Customer customer, double cost);

	// Retrieve
	public Booking getBookingById(int id);

	public Booking getBookingByCustomerId(int id);

	// Delete
	public void deleteBooking(int id);

}
