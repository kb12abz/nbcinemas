package com.nbcinemas.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author kieranbagnall
 * 
 * 
 * 
 **/
@Entity
@Table(name = "Address")
public class Address {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "line1", nullable = false, length = 255)
	@NotNull
	@Size(min = 2, max = 255)
	private String line1;

	@Column(name = "line2", nullable = true, length = 255)
	@Size(min = 0, max = 255)
	private String line2;

	@Column(name = "town", nullable = false, length = 255)

	@Size(min = 2, max = 255)
	private String town;

	@Column(name = "county", nullable = false, length = 255)

	@Size(min = 2, max = 255)
	private String county;

	@Column(name = "postcode", nullable = false, length = 8)
	@NotNull
	@Size(min = 5, max = 8)
	private String postcode;
	
	@Column (name = "deleted")
	private boolean deleted;

	/**
	 * Default constructor taking no arguments
	 */
	public Address() {
	}

	public Address(int id, String line1, String line2, String town, String county, String postcode) {
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
		deleted = false;
	}

	public Address(String line1, String line2, String town, String county, String postcode) {
		this.line1 = line1;
		this.line2 = line2;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
		deleted = false;
	}

	/**
	 * Method to return the ID of the address instance
	 * 
	 * @return Returns ID as an int
	 */
	public int getId() {
		return id;
	}

	/**
	 * Method to set the ID of the address instance
	 * 
	 * @param id
	 *            Input to set the ID
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Method to get line 1 of the address instance
	 * 
	 * @return Returns line 1 of the address as a string
	 */
	public String getLine1() {
		return line1;
	}

	/**
	 * Method to set line 1 of the address instance
	 * 
	 * @param line1
	 *            Input to set line 1 of the address
	 */
	public void setLine1(String line1) {
		this.line1 = line1;
	}

	/**
	 * Method to get line 2 of the address instance
	 * 
	 * @return Returns line 2 of the address as a string
	 */
	public String getLine2() {
		return line2;
	}

	/**
	 * Method to set line 2 of the address instance
	 * 
	 * @param line2
	 *            Input to set line 2 of the address
	 */
	public void setLine2(String line2) {
		this.line2 = line2;
	}

	/**
	 * Method to get the town of the address instance
	 * 
	 * @return Returns the town of the address as a string
	 */
	public String getTown() {
		return town;
	}

	/**
	 * Method to set the town of the address instance
	 * 
	 * @param town
	 *            Input to set the town of the address
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * Method to get the county of the address instance
	 * 
	 * @return Returns the county of the address as a string
	 */
	public String getCounty() {
		return county;
	}

	/**
	 * Method to set the county of the address instance
	 * 
	 * @param county
	 *            Input to set the county of the address
	 */
	public void setCounty(String county) {
		this.county = county;
	}

	/**
	 * Method to get the post code of the address instance
	 * 
	 * @return Returns the post code of the address as a string
	 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * Method to set the post code of the address instance
	 * 
	 * @param postcode
	 *            Input to set the post code of the address
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
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
