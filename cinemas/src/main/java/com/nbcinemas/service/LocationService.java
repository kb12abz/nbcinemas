/**
 * 
 */
package com.nbcinemas.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import com.nbcinemas.entities.Location;
import com.nbcinemas.manager.LocationRepository;

/**
 * @author kieranbagnall
 *
 */
@Stateless
public class LocationService {
	
	@Inject
	private LocationRepository locationManager;
	
	public List<Location> findall(){
		List<Location> locationList = locationManager.findAll();
		return locationList;
	}
	
	public Location findByName(String name){
		return locationManager.getLocationByName(name);
	}
		
}
