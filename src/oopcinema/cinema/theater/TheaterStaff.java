package oopcinema.cinema.theater;


import java.util.List;
import java.util.concurrent.TimeUnit;

import lombok.AllArgsConstructor;
import oopcinema.cinema.CinemaManager;
import oopcinema.cinema.ticketbox.Ticket;
import oopcinema.common.Customer;
import oopcinema.common.Employee;

@AllArgsConstructor
public class TheaterStaff extends Employee{
	private String theaterName;
	
	//고객의 티켓을 확인하여 입장을 관리하는 메소드
	public void checkTicket(Customer customer, Ticket ticket) { 
		System.out.println("티켓 확인중");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if (ticket.getTheaterName().equals(theaterName)){
			System.out.println("티켓 확인이 완료되었습니다.");
			Seat mySeat = customer.findMySeat(ticket);
			System.out.println(mySeat.getSeatNum()+"좌석에 착석했습니다.");
			System.out.println("잠시후 영화가 상영됩니다.");
			
			try{
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			playMovie();
			
			
		}else {
			System.out.println("해당 영화를 관람하실 수 없습니다.");
		}
	}

	//영화를 스크린에 상영시키는 메소드
	public void playMovie() {
		MovieProjector movieProjector = null;
		List<Theater> theaters = CinemaManager.getInstance().getTheaters();

		for (Theater theater : theaters) {
			if(theater.getName().equals(theaterName)){
				movieProjector = theater.getMovieprojector();
			}
		}
		
		if(movieProjector.isPlayable()) {
			System.out.println("영화 상영중 ...");
			try{
				Thread.sleep(3000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("영화 끝");
		}else {
			System.out.println("영사기에 문제가 생겼습니다. 잠시만 기다려 주세요");
		}
	}
	
}
