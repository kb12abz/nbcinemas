/**
 * 
 */
package com.nbcinemas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author kieranbagnall
 *
 */
@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@Column(name = "customerID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int customerID;

	@Column(name = "name")
	private String name;

	@OneToOne
	private Address address;

	@Column(name = "contact")
	private String contact;

	@Column(name = "email")
	private String email;

	@OneToOne
	private WatchList watchList;

	@Column(name = "password")
	private String password;
	
	@Column (name = "deleted")
	private boolean deleted;

	public Customer() {
	}

	public Customer(int id, String name, Address address, String contact, String email, String password) {
		this.customerID = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		watchList = new WatchList();
		this.password = password;
		deleted = false;
	}

	public Customer(String name, Address address, String contact, String email, String password) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		watchList = new WatchList();
		this.password = password;
		deleted = false;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID
	 *            the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the watchList
	 */
	public WatchList getWatchList() {
		return watchList;
	}

	/**
	 * @param watchList the watchList to set
	 */
	public void setWatchList(WatchList watchList) {
		this.watchList = watchList;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
}
