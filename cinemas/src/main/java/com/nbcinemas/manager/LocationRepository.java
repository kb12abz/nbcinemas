/**
 * 
 */
package com.nbcinemas.manager;

import java.util.List;

import com.nbcinemas.entities.Address;
import com.nbcinemas.entities.Location;

/**
 * @author kieranbagnall
 *
 */
public interface LocationRepository {

	// Create
	public void persistLocation(String name, String openingTimes, Address address, int contactNumber, String email);

	// Read
	public Location getLocationById(int id);

	public Location getLocationByName(String name);
	
	public List<Location> findAll();

	// Update
	public void updateOpeningTimes(String times, int id);

	public void updateContactNumber(int contactNumber, int id);

	public void updateEmail(String email, int id);

	public void updateLocationAddress(Address address, int id);

	// Delete
	public void deleteLocation(int id);

}
