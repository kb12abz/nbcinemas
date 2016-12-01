/**
 * 
 */
package com.nbcinemas.initialData;
import com.nbcinemas.entities.*;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * @author kieranbagnall
 *
 */
@Singleton
@Startup
public class InitialData {
	
	public List<Address> addresses = new ArrayList<Address>();
	public List<Booking> bookings = new ArrayList<Booking>();
	public List<Customer> customers = new ArrayList<Customer>();
	public List<Film> films = new ArrayList<Film>();
	public List<Location> locations = new ArrayList<Location>();
	public List<Screen> screens = new ArrayList<Screen>();
	public List<Seat> seats = new ArrayList<Seat>();
	public List<Showing> showings = new ArrayList<Showing>();
	public List<Ticket> tickets = new ArrayList<Ticket>();
	public List<WatchList> watchLists = new ArrayList<WatchList>();
	public List<WatchListDetails> watchDetails = new ArrayList<WatchListDetails>();
	
	public InitialData(){
		
		Address address = new Address("Line1", "line2", "town", "county", "postcode");
		address.setId(1);
		addresses.add(address);
	}

	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}
	
	public void addAddress(Address address){
		addresses.add(address);
	}

	/**
	 * @return the bookings
	 */
	public List<Booking> getBookings() {
		return bookings;
	}
	
	public void addBooking(Booking booking){
		bookings.add(booking);
	}

	/**
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}
	
	public void addCustomer(Customer customer){
		customers.add(customer);
	}

	/**
	 * @return the films
	 */
	public List<Film> getFilms() {
		return films;
	}
	
	public void addFilm(Film film){
		films.add(film);
	}

	/**
	 * @return the locations
	 */
	public List<Location> getLocations() {
		return locations;
	}

	public void addLocation(Location location){
		locations.add(location);
	}
	/**
	 * @return the screens
	 */
	public List<Screen> getScreens() {
		return screens;
	}
	
	public void addScreen(Screen screen){
		screens.add(screen);
	}

	/**
	 * @return the seats
	 */
	public List<Seat> getSeats() {
		return seats;
	}
	
	public void addSeat(Seat seat){
		seats.add(seat);
	}

	/**
	 * @return the showings
	 */
	public List<Showing> getShowings() {
		return showings;
	}
	
	public void addShowing(Showing showing){
		showings.add(showing);
	}

	/**
	 * @return the tickets
	 */
	public List<Ticket> getTickets() {
		return tickets;
	}
	
	public void addTicket(Ticket ticket){
		tickets.add(ticket);
	}

	/**
	 * @return the watchLists
	 */
	public List<WatchList> getWatchLists() {
		return watchLists;
	}
	
	public void addWatchList(WatchList watchList){
		watchLists.add(watchList);
	}

	/**
	 * @return the watchListDetails
	 */
	public List<WatchListDetails> getWatchListDetails() {
		return watchDetails;
	}
	
	public void addWatchListDetails(WatchListDetails watchListDetails){
		watchDetails.add(watchListDetails);
	}
	
	
	
	
	

}
