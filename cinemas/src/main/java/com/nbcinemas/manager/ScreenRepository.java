/**
 * 
 */
package com.nbcinemas.manager;

import java.util.List;

import com.nbcinemas.entities.Screen;
import com.nbcinemas.entities.Seat;

/**
 * @author kieranbagnall
 *
 */
public interface ScreenRepository {

	// Create
	public void persistScreen(int number, List<Seat> seats);

	// Read
	public Screen getScreenById(long id);

	// Update
	public void updateNumberOfSeats(int seatNumber, int id);

	public void updateStatus(boolean status, int id);

	// Delete
	public void deleteScreen(int id);

}
