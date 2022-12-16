package oopcinema.cinema.ticketbox;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * MovieInfo movieInfo
 * private LocalDateTime transactionDate;
 * 
 */
@Getter
@AllArgsConstructor
public class Ticket {
	private String movieTitle;
	private String movieShowTime;
	private String customerNickname;
	private String theaterName;
	private String seatNum;
	private LocalDateTime transactionDate;
	
	
	@Override
	public String toString() {
		return "영화제목 : " + movieTitle + ", 상영시간 : " + movieShowTime + ", 사용자 닉네임 : "
				+ customerNickname + " 상영관 : " + theaterName +", 거래일자 : " + transactionDate;
	}
	
	
}