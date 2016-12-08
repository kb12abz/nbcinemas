package com.nbcinemas.offlineManager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Film;
import com.nbcinemas.entities.Location;
import com.nbcinemas.entities.Screen;
import com.nbcinemas.entities.Showing;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.ShowingRepository;

@Default
@Stateless
public class ShowingRepositoryOffline implements ShowingRepository {

	@Inject
	private InitialData initialdata;

	@Override
	public void persistShowing(Location location, Screen screen, Film film, Calendar date, String time) {
		Showing s = new Showing(location, screen, film, date, time);
		s.setShowingID(initialdata.showings.size() + 1);
		initialdata.addShowing(s);
	}

	@Override
	public Showing getShowingById(int id) {
		for (Showing s : initialdata.showings) {
			if (s.getShowingID() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public List<Showing> getShowingsByLocation(String location) {
		ArrayList<Showing> foundShowings = new ArrayList<Showing>();
		for (Showing s : initialdata.showings) {
			if (s.getLocation().getCinemasName().toLowerCase().equals(location.toLowerCase())) {
				foundShowings.add(s);
			}
		}
		return foundShowings;
	}
	
	@Override
	public List<Showing> findAll(){
		return initialdata.showings;
	}

	@Override
	public void updateLocation(Location location, int id) {
		for (Showing s : initialdata.showings) {
			if (s.getShowingID() == id) {
				s.setLocation(location);
			}
		}
	}

	@Override
	public void updateScreen(Screen screen, int id) {
		for (Showing s : initialdata.showings) {
			if (s.getShowingID() == id) {
				s.setScreen(screen);
			}
		}
	}

	@Override
	public void updateFil(Film film, int id) {
		for (Showing s : initialdata.showings) {
			if (s.getShowingID() == id) {
				s.setFilm(film);
				;
			}
		}
	}

	@Override
	public void updateDateOfShowing(Calendar date, int id) {
		for (Showing s : initialdata.showings) {
			if (s.getShowingID() == id) {
				s.setDateOfShowing(date);
			}
		}
	}

	@Override
	public void updateTimeOfShowing(String time, int id) {
		for (Showing s : initialdata.showings) {
			if (s.getShowingID() == id) {
				s.setTimeOfShowing(time);
			}
		}
	}

	@Override
	public void deleteShowing(int id) {
		for (Showing s : initialdata.showings){
			if (s.getShowingID() == id){
				s.setDeleted(true);
			}		
		}
	}

}

