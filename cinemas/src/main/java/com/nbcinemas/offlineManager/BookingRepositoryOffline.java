/**
 * 
 */
package com.nbcinemas.offlineManager;

import java.util.Date;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Booking;
import com.nbcinemas.entities.Customer;
import com.nbcinemas.manager.BookingRepository;
import com.nbcinemas.initialData.*;

/**
 * @author kieranbagnall
 *
 */
@Default
@Stateless
public class BookingRepositoryOffline implements BookingRepository {

	@Inject
	private InitialData initialData;

	@Override
	public void persistBooking(Date date, Customer customer, double cost) {
		Booking b = new Booking(date, customer, cost);
		b.setBookingID(initialData.getBookings().size() + 1);
		initialData.addBooking(b);
	}

	@Override
	public Booking getBookingById(int id) {
		for (Booking b : initialData.bookings) {
			if (b.getBookingID() == id) {
				return b;
			}
		}
		return null;
	}

	@Override
	public Booking getBookingByCustomerId(int id) {
		for (Booking b : initialData.bookings) {
			if (b.getCustomer().getCustomerID() == id) {
				return b;
			}
		}
		return null;
	}

	@Override
	public void deleteBooking(int id) {
		// TODO Auto-generated method stub

	}

}
