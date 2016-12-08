/**
 * 
 */
package com.nbcinemas.initialData;
import com.nbcinemas.entities.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
		Film f1 = new Film(1, "Doctor Strange", 2, "Doctor Stephen Strange (Benedict Cumberbatch) is a brilliant yet arrogant neurosurgeon whose life is turned upside down when he barely survives a devastating car accident. Embarking on a journey of self-discovery, he travels to the Far East where he becomes the protégé of the mysterious Ancient One (Tilda Swinton). A mystical being she opens Stephen’s mind to extraordinary alternate dimensions, which Stephen eventually learns to manipulate in his new guise as superhero Doctor Strange. Soon Stephen’s abilities are put to the ultimate test when villainous Kaecilius (Mads Mikkelsen) threatens the future of the entire world. ", "img/strangeCover.jpg", "img/strangeBanner.jpg", new Date(116,10,19));
		films.add(f1);
		Film f2 = new Film(2, "Fantastic Beasts & Where To Find Them", 4, "It’s 1926, and 'Magizoologist' Newt Scamander (Eddie Redmayne) arrives in New York City for a meeting with the Magical Congress of the United States of America. He doesn’t arrive alone, however – in his magical suitcase live a menagerie of dangerous creatures. But when the beasts escape, officials from the Magical Congress send the wizarding authorities after Newt, as the peaceful relationship between magic people and Muggles comes under threat. ", "img/fantasticCover.jpg", "img/fantasticBanner.jpg", new Date(116,10,19));
		films.add(f2);
		Film f3 = new Film(3, "Rogue One", 4, "It is a period of civil war. The Galactic Empire rules the galaxy, and are putting the finishing touches to their ultimate super-weapon, the Death Star. The Rebellion plan to steal the its plans in order to detect a weak spot in which to destroy it. They recruit Jyn Erso (Felicity Jones) to work with Rebel fighter Cassian Andor (Diego Luna) and a team to undertake the deadly mission. ", "img/rogueCover.jpg", "img/rogueBanner.jpg", new Date(116,10,19));
		films.add(f3);
		Film f4 = new Film(4, "Miss Peregrine's Home For Peculiar Children", 3, "Sixteen-year-old Jacob Portman (Asa Butterfield) has grown up listening to his grandfather's bizarre stories of the residents of a strange and mysterious island orphanage known as Miss Peregrine's Home for Peculiars. When the old man dies in mysterious circumstances, he leaves young Jacob clues that set him on an extraordinary quest. What he finds is a magical place, spanning different worlds and times, whose residents possess astonishing abilities. But they are also under threat from sinister monsters. Now it's up to Jacob to use his own 'peculiarity' to save them. ", "img/missCover.jpg", "img/missBanner.jpg", new Date(116,10,19));
		films.add(f4);
		Film f5 = new Film(5, "Bridget Jones's Baby ", 4, "Loveable singleton Bridget Jones approaches motherhood in this latest entry of the smash-hit comedy series. 12 years after the events of The Edge of Reason, hapless Bridget (Renee Zellweger) is now in her forties and enjoying her role as a high-flying news producer, but is no longer with hunky beau Mark Darcy (Colin Firth). She’s therefore a bit surprised to find out that she’s pregnant – but who’s the father? Is it Mark, or her handsome new fella Jack Qwant (Patrick Dempsey)? One thing’s for sure: Bridget’s journey as she attempts to find out promises to be as hilarious and revealing as ever. ", "img/bridgetCover.jpg", "img/bridgetBanner.jpg", new Date(116,10,19));
		films.add(f5);
		Film f6 = new Film(6, "Inferno", 3, "Eminent Harvard symbologist Professor Robert Langdon (Tom Hanks) awakes in a Florence hospital bed suffering from amnesia. Now he faces two challenges. First, he must recover his memories. Then he has to tackle the most extraordinary puzzle of his career. Brilliant yet utterly deranged scientist Bertrand Zobrist (Ben Foster) plans to unleash a global plague that could wipe out the human race. In a desperate bid to stop him, Langdon races against time to solve a mystery that hinges on Dante's 14th century vision of hell. This time, however, he has a resourceful assistant: medic Dr. Sienna Brooks (Felicity Jones). ", "img/infoCover.jpg", "img/infoBanner.jpg", new Date(116,10,19));
		films.add(f6);
		
		Address a1 = new Address(1, "line1", "line2", "town", "county", "postcode"); 
		Location l1 = new Location(1, "Basildon", "Something", a1 , 1268, "something@something");
		locations.add(l1);
		Location l2 = new Location(1, "Southend", "Something", a1 , 1268, "something@something");
		locations.add(l2);
				
		Seat seat1 = new Seat(1, "a", 1, false);
		seats.add(seat1);
		Screen sc1 = new Screen(1,seats);
		screens.add(sc1);
		
		Screen sc2 = new Screen(2,seats);
		screens.add(sc2);
	
		
		Calendar c1 = Calendar.getInstance();
		c1.set(2016, 11,7); // 7/12/2016
		
		Calendar c2 = Calendar.getInstance();
		c2.set(2016, 11, 7); //7/12/2016
		
		Calendar c3 = Calendar.getInstance();
		c3.set(2016, 11,10);
		
		Calendar c4 = Calendar.getInstance();
		c4.set(2016, 11,10);
		
		Calendar c5 = Calendar.getInstance();
		c5.set(2016, 11,10);
		
		Calendar c6= Calendar.getInstance();
		c6.set(2016, 11,11);
		
		
		
		
		Showing sh1 = new Showing(1, l1, sc1, f1, c1, "12.00");
		Showing sh2 = new Showing(2, l1, sc1, f1, c2, "12.45");
		Showing sh3 = new Showing(3, l1, sc1, f1, c3, "14.00");
		Showing sh4 = new Showing(4, l1, sc1, f1, c4, "15.45");
		
		Showing sh5 = new Showing(5, l1, sc2, f3, c1, "09.00");
		Showing sh6 = new Showing(6, l1, sc2, f3, c1, "11.00");
		
		Showing sh7 = new Showing(7, l1, sc2, f4, c6, "09.00");
		Showing sh8 = new Showing(8, l1, sc2, f4, c6, "17.00");
		Showing sh9 = new Showing(9, l1, sc2, f4, c6, "18.15");
		
		Showing sh10 = new Showing(10, l1, sc2, f6, c5, "19.00");
				
		
		Showing sh11 = new Showing(11, l2, sc1, f2, c5, "09.00");
		Showing sh12 = new Showing(12, l2, sc1, f2, c5, "09.45");
		
		Showing sh13 = new Showing(13, l2, sc2, f3, c4, "09.00");
		Showing sh14 = new Showing(14, l2, sc2, f3, c4, "11.45");
		Showing sh15 = new Showing(15, l2, sc2, f3, c5, "15.00");
		Showing sh16 = new Showing(16, l2, sc2, f3, c5, "18.45");
		
		
		Showing sh17 = new Showing(17, l2, sc2, f5, c1, "09.00");
		Showing sh18 = new Showing(18, l2, sc2, f5, c1, "11.45");
		Showing sh19 = new Showing(19, l2, sc2, f5, c5, "15.00");
		Showing sh20 = new Showing(20, l2, sc2, f5, c5, "18.45");
		
		
		
		showings.add(sh1);
		showings.add(sh2);
		showings.add(sh3);
		showings.add(sh4);
		showings.add(sh5);
		showings.add(sh6);
		showings.add(sh7);
		showings.add(sh8);
		showings.add(sh9);
		showings.add(sh10);
		showings.add(sh11);
		showings.add(sh12);
		showings.add(sh13);
		showings.add(sh14);
		showings.add(sh15);
		showings.add(sh16);
		showings.add(sh17);
		showings.add(sh18);
		showings.add(sh19);
		showings.add(sh20);	
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
