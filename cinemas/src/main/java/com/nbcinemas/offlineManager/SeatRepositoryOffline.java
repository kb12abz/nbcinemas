package com.nbcinemas.offlineManager;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Screen;
import com.nbcinemas.entities.Seat;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.SeatRepository;

@Default
@Stateless
public class SeatRepositoryOffline implements SeatRepository {

	@Inject
	private InitialData intialdata;

	@Override
	public void persistSeat(String row, int number, boolean occupied) {
		Seat s = new Seat(row, number, occupied);
		s.setSeatID(intialdata.seats.size()+1);
		intialdata.addSeat(s);

	}

	@Override
	public Seat getSeatById(int id) {
		for (Seat s : intialdata.seats){
			if (s.getSeatID() == id){
				return s;
			}
		}
		return null;
	}

	@Override
	public void deleteSeat(int id) {
		for (Seat s : intialdata.seats){
			if (s.getSeatID() == id){
				s.setDeleted(true);
			}
		}
	}

}
