/**
 * 
 */
package com.nbcinemas.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;

import com.nbcinemas.entities.Location;
import com.nbcinemas.service.LocationService;

/**
 * @author kieranbagnall
 *
 */
@Named("locations")
@SessionScoped
public class LocationController implements Serializable {

	@Inject
	private SelectedLocation selectedLocation;
	
	@Inject
	private ShowingController showingController;

	@Inject
	private LocationService locationService;

	private Location previousLocationSelected;
	private String location;
	private List<Location> dataModel = null;
	

	public List<Location> getDataModel() {
		if (dataModel == null) {
			dataModel = locationService.findall();
		}
		return dataModel;
	}
	
	public void setDataModel(List<Location> locationList){
		dataModel = locationList;
	}
	
	public void resetDataModel(){
		dataModel = null;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	public void LocationChangeListener() {
		if ((location != null) && (previousLocationSelected == null)) {
			selectedLocation.setLocation(locationService.findByName(location));
			dataModel.remove(locationService.findByName(location));
			previousLocationSelected = selectedLocation.getLocation();
			showingController.getDataModel();
			showingController.getShowingDates();
		} else if ((location != null) && (previousLocationSelected != null)) {
			if (previousLocationSelected.getCinemasName() != location) {
				selectedLocation.setLocation(locationService.findByName(location));
				dataModel.add(previousLocationSelected);
				dataModel.remove(locationService.findByName(location));
				previousLocationSelected = selectedLocation.getLocation();
				showingController.getDataModel();
				showingController.getShowingDates();
			}
		}
	}

	public String locationSet() {
		String returnValue = "Select Location..";
		if (selectedLocation.getLocation() != null) {
			returnValue = selectedLocation.getLocation().getCinemasName();
		}
		return returnValue;
	}


	/**
	 * @return the previousLocationSelected
	 */
	public Location getPreviousLocationSelected() {
		return previousLocationSelected;
	}
	
	

}
