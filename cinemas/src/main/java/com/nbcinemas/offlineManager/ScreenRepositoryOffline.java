package com.nbcinemas.offlineManager;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Screen;
import com.nbcinemas.entities.Seat;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.ScreenRepository;

@Default
@Stateless
public class ScreenRepositoryOffline implements ScreenRepository {

	@Inject
	private InitialData intialdata;

	@Override
	public void persistScreen(int number, List<Seat> seats) {
		Screen s = new Screen(number, seats);
		s.setScreenID(intialdata.screens.size() + 1);
		intialdata.addScreen(s);
	}

	@Override
	public Screen getScreenById(long id) {
		for (Screen s : intialdata.screens) {
			if (s.getScreenID() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public void updateNumberOfSeats(int seatNumber, int id) {
		for (Screen s : intialdata.screens) {
			if (s.getScreenID() == id) {
				s.setNumberOfSeats(seatNumber);
			}
		}
	}

	@Override
	public void updateStatus(boolean status, int id) {
		for (Screen s : intialdata.screens) {
			if (s.getScreenID() == id) {
				s.setActive(status);
			}
		}
	}

	@Override
	public void deleteScreen(int id) {
		for (Screen s : intialdata.screens) {
			if (s.getScreenID() == id) {
				s.setDeleted(true);
			}
		}
	}

}
