/**
 * 
 */
package com.nbcinemas.controllers;

import javax.ejb.Stateless;

import com.nbcinemas.entities.Customer;

/**
 * @author kieranbagnall
 *
 */
@Stateless
public class CurrentUser {
	
	private Customer customer;

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
	
	

}
