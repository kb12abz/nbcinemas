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
@Table (name = "Location")
public class Location {

	@Id
	@Column (name = "locationID")
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@NotNull
	private int locationID;
	
	@Column (name = "cinemasName")
	private String cinemasName;
	
	@Column (name = "openingTimes")
	private String openingTimes;
	
	@OneToOne
	private Address address;
	
	@Column (name = "contactNumber")
	private int contactNumber;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "deleted")
	private boolean deleted;
	
	public Location(){}
	
	public Location(int id, String name, String openingTimes, Address address, int contactNumber, String email){
		this.locationID = id;
		this.cinemasName = name;
		this.openingTimes = openingTimes;
		this.address = address;
		this.email = email;
		deleted = false;
	}
	
	public Location(String name, String openingTimes, Address address, int contactNumber, String email){
		this.cinemasName = name;
		this.openingTimes = openingTimes;
		this.address = address;
		this.email = email;
		deleted = false;
	}

	/**
	 * @return the locationID
	 */
	public int getLocationID() {
		return locationID;
	}

	/**
	 * @param locationID the locationID to set
	 */
	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	/**
	 * @return the cinemasName
	 */
	public String getCinemasName() {
		return cinemasName;
	}

	/**
	 * @param cinemasName the cinemasName to set
	 */
	public void setCinemasName(String cinemasName) {
		this.cinemasName = cinemasName;
	}

	/**
	 * @return the openingTimes
	 */
	public String getOpeningTimes() {
		return openingTimes;
	}

	/**
	 * @param openingTimes the openingTimes to set
	 */
	public void setOpeningTimes(String openingTimes) {
		this.openingTimes = openingTimes;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the contactNumber
	 */
	public int getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
