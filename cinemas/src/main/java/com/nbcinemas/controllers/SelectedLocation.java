/**
 * 
 */
package com.nbcinemas.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.nbcinemas.entities.Location;

/**
 * @author kieranbagnall
 *
 */
@Named("selectedLocation")
@SessionScoped
public class SelectedLocation implements Serializable {
	
	private Location location;

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
}
