package oopcinema.cinema.ticketbox;

import java.time.LocalDateTime;

import oopcinema.common.Employee;

public class TicketStaff extends Employee {

	public Ticket receiveOrder(String nickName, String selectedMovieName, String[] selectedMovieShowtime) {
		String MovieShowtime = selectedMovieShowtime[0].replace("[", "");
		String MovieTheaterNum = selectedMovieShowtime[1].replace("]", "").replace(" ", "");
		
		
		Ticket ticket = new Ticket(selectedMovieName, MovieShowtime, nickName, MovieTheaterNum,"H11", LocalDateTime.now());
		return ticket;
	}

}
