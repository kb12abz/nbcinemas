package com.nbcinemas.offlineManager;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.nbcinemas.entities.Booking;
import com.nbcinemas.entities.Seat;
import com.nbcinemas.entities.Showing;
import com.nbcinemas.entities.Ticket;
import com.nbcinemas.initialData.InitialData;
import com.nbcinemas.manager.TicketRepository;

@Default
@Stateless
public class TicketRepositoryOffline implements TicketRepository {
	
	@Inject
	private InitialData initialdata;

	@Override
	public void persistTicket(Booking booking, Showing showing, Seat seat, String type, int cost) {
		Ticket t = new Ticket(booking, showing, seat, type, cost);
		t.setTicketID(initialdata.tickets.size()+1);
		initialdata.addTicket(t);		
	}

	@Override
	public Ticket getTicketById(int id) {
		for (Ticket t : initialdata.tickets){
			if (t.getTicketID() == id){
				return t;
			}
		}
		return null;
	}

	@Override
	public void updateShowing(Showing showing, int id) {
		for (Ticket t : initialdata.tickets){
			if (t.getTicketID() == id){
				t.setShowing(showing);
			}
		}
		
	}

	@Override
	public void updateSeat(Seat seat, int id) {
		for (Ticket t : initialdata.tickets){
			if (t.getTicketID() == id){
				t.setSeat(seat);
			}
		}		
	}

	@Override
	public void deleteTicket(int id) {
		for (Ticket t : initialdata.tickets){
			if (t.getTicketID() == id){
				t.setDeleted(true);
			}
		}		
	}

}
