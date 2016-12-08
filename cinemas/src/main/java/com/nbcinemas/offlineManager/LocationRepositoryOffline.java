package com.nbcinemas.offlineManager;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Address;
import com.nbcinemas.entities.Location;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.LocationRepository;

@Default
@Stateless
public class LocationRepositoryOffline implements LocationRepository {

	@Inject
	private InitialData intialdata;

	@Override
	public void persistLocation(String name, String openingTimes, Address address, int contactNumber, String email) {
		Location l = new Location(name, openingTimes, address, contactNumber, email);
		l.setLocationID(intialdata.locations.size() + 1);
		intialdata.addLocation(l);
	}

	@Override
	public Location getLocationById(int id) {
		for (Location l : intialdata.locations) {
			if (l.getLocationID() == id) {
				return l;
			}
		}
		return null;
	}

	@Override
	public Location getLocationByName(String name) {
		for (Location l : intialdata.locations) {
			if (l.getCinemasName().toLowerCase().equals(name.toLowerCase())) {
				return l;
			}
		}
		return null;
	}

	@Override
	public void updateOpeningTimes(String times, int id) {
		for (Location l : intialdata.locations) {
			if (l.getLocationID() == id) {
				l.setOpeningTimes(times);
			}
		}

	}

	@Override
	public void updateContactNumber(int contactNumber, int id) {
		for (Location l : intialdata.locations) {
			if (l.getLocationID() == id) {
				l.setContactNumber(contactNumber);
			}
		}
	}

	@Override
	public void updateEmail(String email, int id) {
		for (Location l : intialdata.locations) {
			if (l.getLocationID() == id) {
				l.setEmail(email);
			}
		}
	}

	@Override
	public void updateLocationAddress(Address address, int id) {
		for (Location l : intialdata.locations) {
			if (l.getLocationID() == id) {
				l.setAddress(address);
			}
		}
	}

	@Override
	public void deleteLocation(int id) {
		for (Location l : intialdata.locations) {
			if (l.getLocationID() == id) {
				l.setDeleted(true);
			}
		}
	}

	@Override
	public List<Location> findAll() {
		return intialdata.locations;
	}

}
