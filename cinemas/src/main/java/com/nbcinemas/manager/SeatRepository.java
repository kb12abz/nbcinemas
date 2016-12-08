/**
 * 
 */
package com.nbcinemas.manager;

import com.nbcinemas.entities.Screen;
import com.nbcinemas.entities.Seat;

/**
 * @author kieranbagnall
 *
 */
public interface SeatRepository {

	// Create
	public void persistSeat(String row, int number, boolean occupied);

	// Read
	public Seat getSeatById(int id);

	// Update

	// Delete
	public void deleteSeat(int id);

}
