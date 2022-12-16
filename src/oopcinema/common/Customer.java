package oopcinema.common;

import java.util.Arrays;
import java.util.Scanner;

import lombok.Getter;
import oopcinema.cinema.CinemaManager;
import oopcinema.cinema.theater.Seat;
import oopcinema.cinema.theater.TheaterStaff;
import oopcinema.cinema.ticketbox.Ticket;
import oopcinema.cinema.ticketbox.TicketStaff;

@Getter
public class Customer extends Person{
	private String nickName;
	private int balance;
	
	public Customer(String nickName, int balance) {
		super();
		this.nickName = nickName;
		this.balance = balance;
	}
	
	public Ticket checkMovie() {
		Scanner sc = new Scanner(System.in); // Python의 input()과 동일
		
		// 메뉴판을 가져다 줄 Staff 필요
		TicketStaff staff = CinemaManager.getInstance().getTicketStaffs().get(0);
		
		System.out.println("어서오세요 CGV입니다. 어떤 영화 상영하시겠어요?");
		System.out.println(CinemaManager.getInstance().getMovies());
		
		String selectedMovieName = sc.nextLine();
		
		System.out.println(selectedMovieName +" 상영시간표 입니다. 몇 시로 도와드릴까요?");
//		System.out.println(CinemaManager.getInstance().getMovieTimeTable().get(selectedMovieName));
		String[][] timetable = CinemaManager.getInstance().getMovieTimeTable().get(selectedMovieName);
		System.out.println(Arrays.deepToString(timetable));
		
		String selectedMovieShowtime = sc.nextLine();
		
		String[] selectedMovieShowtimeArr = selectedMovieShowtime.split(",");
		
		System.out.println(selectedMovieName + " " + selectedMovieShowtimeArr[0] + " 영화 맞으세요? 맞으면 1번 아니면 0번");
		
		
		int isConfirmed = sc.nextInt();
		Ticket myTicket = null ;
		if (isConfirmed == 1) {
			myTicket =  confirmOrder(staff, selectedMovieName, selectedMovieShowtimeArr);
			
		} 
		return myTicket;
	}

	private Ticket confirmOrder(TicketStaff ticketStaff, String selectedMovieName, String[] selectedMovieShowtime) {
		Ticket myTicket = ticketStaff.receiveOrder(nickName, selectedMovieName, selectedMovieShowtime);
		balance = balance - 12000;
		System.out.println("티켓 확인 해주세요! :) ");
		System.out.println(myTicket);
		System.out.println("잔돈 " + balance + "원 거슬러 드릴게요");
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return myTicket;
//		System.out.println("상영관으로 이동합니다.");
//		goToTheater(myTicket);
	}
	
	public void goToTheater(Ticket ticket) {
		TheaterStaff theaterstaff = new TheaterStaff(ticket.getTheaterName());
		theaterstaff.checkTicket(this, ticket);
		
	}
	
	public Seat findMySeat(Ticket ticket) {
		Scanner sc = new Scanner(System.in);
		String mySeatNum = ticket.getSeatNum();
		String foundSeatNum;
		
		System.out.println("내 좌석번호는? ");
		while(true) {
			foundSeatNum = sc.next();
			if(mySeatNum.equals(foundSeatNum)) {
				System.out.println("착석완료");
				break;
			}else {
				System.out.println("내 자리가 아니다! 다시 찾자");
			}
		}
		Seat mySeat = new Seat(foundSeatNum);
		return mySeat;
		
	}

}
