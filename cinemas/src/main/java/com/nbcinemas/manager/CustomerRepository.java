/**
 * 
 */
package com.nbcinemas.manager;

import java.util.List;

import com.nbcinemas.entities.Address;
import com.nbcinemas.entities.Customer;

/**
 * @author kieranbagnall
 *
 */
public interface CustomerRepository {
	
	// Create
	public void persistCustomer(String name, Address address, String contact, String email, String password);

	// Read
	public Customer getCustomerById(long id);

	public Customer getCustomerByEmail(String email);

	// Update
	public void changeFirstName(String name, int id);

	public void changePassword(String password, int id);

	public void changeEmailAddress(String email, int id);

	public void changecustomerAddress(Address customersAddresses, int id);

	// Delete
	public void deleteCustomer(int id);
}
