package oopcinema;

import java.util.Scanner;

import oopcinema.cinema.CinemaManager;
import oopcinema.cinema.ticketbox.Ticket;
import oopcinema.common.Customer;

public class CinemaApplication {

	public static void main(String[] args) {
		Customer lim = CinemaManager.getInstance().getCustomers().get(0);
		Ticket myTicket = lim.checkMovie();
		lim.goToTheater(myTicket);


	}

}
