/**
 * 
 */
package com.nbcinemas.offlineManager;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Address;
import com.nbcinemas.entities.Customer;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.CustomerRepository;

/**
 * @author kieranbagnall
 *
 */
@Default
@Stateless
public class CustomerRepositoryOffline implements CustomerRepository {

	@Inject
	private InitialData initialData;

	@Override
	public void persistCustomer(String name, Address address, String contact, String email, String password) {
		Customer c = new Customer(name, address, contact, email, password);
		c.setCustomerID(initialData.getCustomers().size() + 1);
		initialData.addCustomer(c);
	}

	@Override
	public Customer getCustomerById(long id) {
		for (Customer c : initialData.customers) {
			if (c.getCustomerID() == id) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		for (Customer c : initialData.customers) {
			if (c.getEmail().equals(email)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void changeFirstName(String name, int id) {
		for (Customer c : initialData.customers) {
			if (c.getCustomerID() == id) {
				c.setName(name);
			}
		}

	}

	@Override
	public void changePassword(String password, int id) {
		for (Customer c : initialData.customers) {
			if (c.getCustomerID() == id) {
				c.setPassword(password);
			}
		}

	}

	@Override
	public void changeEmailAddress(String email, int id) {
		for (Customer c : initialData.customers) {
			if (c.getCustomerID() == id) {
				c.setEmail(email);
				;
			}
		}

	}

	@Override
	public void changecustomerAddress(Address customersAddresses, int id) {
		for (Customer c : initialData.customers) {
			if (c.getCustomerID() == id) {
				c.setAddress(customersAddresses);
				;
			}
		}
	}

	@Override
	public void deleteCustomer(int id) {
		for (Customer c : initialData.customers) {
			if (c.getCustomerID() == id) {
				c.setDeleted(true);
				;
			}
		}
	}

}
