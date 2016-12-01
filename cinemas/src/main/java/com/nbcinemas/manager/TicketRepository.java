/**
 * 
 */
package com.nbcinemas.manager;

import com.nbcinemas.entities.Booking;
import com.nbcinemas.entities.Seat;
import com.nbcinemas.entities.Showing;
import com.nbcinemas.entities.Ticket;

/**
 * @author kieranbagnall
 *
 */
public interface TicketRepository {

	// Create
	public void persistTicket(Booking booking, Showing showing, Seat seat, String type, int cost);

	// Retrieve
	public Ticket getTicketById(int id);

	// Update
	public void updateShowing(Showing showing, int id);

	public void updateSeat(Seat seat, int id);

	// Delete
	public void deleteTicket(int id);

}
