package com.nbcinemas.manager;

import java.util.List;

import com.nbcinemas.entities.Address;

/**
 * 
 * @author kieranbagnall
 */

public interface AddressRepository {

	// Create
	public void persistAddress(Address a);

	// Retrieve
	public Address getAddressById(int id);

	public Address getAddressIdByFirstLineAndPostcode(String firstLine, String postcode);

	public List<Address> getAllAddresses();

	// Update
	public void updateAddressFirstLine(String line1, int id);
	public void updateAddressSecondLine(String line2, int id);
	public void updatePostCode(String postcode, int id);
	public void updateCounty(String county, int id);

	// Delete
	public void deleteAddress(int id);

}