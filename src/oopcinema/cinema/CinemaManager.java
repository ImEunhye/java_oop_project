package oopcinema.cinema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import oopcinema.cinema.theater.MovieProjector;
import oopcinema.cinema.theater.Theater;
import oopcinema.cinema.ticketbox.Movie;
import oopcinema.cinema.ticketbox.MovieInfo;
import oopcinema.cinema.ticketbox.TicketStaff;
import oopcinema.common.Customer;

/**
	오픈할 때 필요한 기본 데이터들 세팅 클래스 
*  	오픈할 때 필요한 기본 데이터들 세팅 클래스 

* Field Summary
* 1. 스태프 직원들 - List<Staff> staffs
* 2. 바리스타 직원들 - List<Barista> baristas;
* 3. 메뉴판 - Menu menu;
* 4. 음료 레시피 - List<Recipe> recipes;
* 5. 손님들 - List<Customer> customers; 
*/
@Getter
public class CinemaManager{
	private List<TicketStaff> ticketStaffs;
	private List<Movie> movies;
	private HashMap<String, String[][]> movieTimeTable = new HashMap<>();
	private List<Customer> customers = new ArrayList<>();
	private List<Theater> theaters;
	
	private static CinemaManager cinemaManager = new CinemaManager();
	
	
	private CinemaManager() {
		//theater 리스트
		Theater theater1 = new Theater("1관", 100, "2D",new MovieProjector("A123", true));
		Theater theater2 = new Theater("2관", 200, "2D",new MovieProjector("A234", true));
		Theater theater3 = new Theater("3관", 300, "2D",new MovieProjector("A345", false));
		Theater theater3D = new Theater("3D관", 150, "3D",new MovieProjector("B13", true));
		Theater theater4D= new Theater("4D관", 80, "4D",new MovieProjector("B23", true));
		Theater theaterImax = new Theater("IMAX관", 500, "IMAX",new MovieProjector("C123", true));
		
		Theater[] theaterList = {theater1, theater2, theater3, theater3D, theater4D, theaterImax};
		
		theaters = new ArrayList<>(Arrays.asList(theaterList));
		
		TicketStaff kang = new TicketStaff();
		TicketStaff kim = new TicketStaff();
		TicketStaff koo = new TicketStaff();
		
		TicketStaff[] staffList = { kang, kim, koo };
		ticketStaffs = new ArrayList<>(Arrays.asList(staffList));
		
		String[] avatarCharacters = {"샘 워딩턴", "조애 살다나"};
		MovieInfo avatarInfo = new MovieInfo(avatarCharacters, "액션", "192분" );
		String[] owlCharacters = {"류준열", "유해진"};
		MovieInfo owlInfo = new MovieInfo(owlCharacters, "스릴러", "118분" );
		String[] conanCharacters = {"에도가와 코난", "고뭉치"};
		MovieInfo conanInfo = new MovieInfo(conanCharacters, "애니메이션", "106분" );
		String[] heroCharacters = {"정성화", "김고은"};
		MovieInfo heroInfo = new MovieInfo(heroCharacters, "드라마", "120분" );
		String[] pororoCharacters = {"뽀로로", "루피"};
		MovieInfo pororoInfo = new MovieInfo(pororoCharacters, "애니메이션", "63분" );
		
		Movie avatar = new Movie("아바타: 물의 길", avatarInfo);
		Movie owl = new Movie("올빼미", avatarInfo);
		Movie conan = new Movie("코난 극장판: 베이커가의 망령", avatarInfo);
		Movie hero = new Movie("영웅", avatarInfo);
		Movie pororo = new Movie("극장판 뽀로로와 친구들: 바이러스를 없애줘", avatarInfo);
		
		Movie[] movieList = { avatar, owl, conan, hero, pororo };
		movies = new ArrayList<>(Arrays.asList(movieList));
		
		String[][] avatarShowTimeList = {{"15:15", "1관"}, {"17:"
				+ ""
				+ "40", "3관"}, {"20:20", "3D관"}, {"21:50", "4D관"}};

		String[][] owlShowTimeList = { {"16:20", "IMAX관"},{"20:20", "2관"}, {"23:00", "1관"} };
		
		String[][] conanShowTimeList = { {"17:40", "3관"},{"21:00", "3D관"}, {"21:50", "2관"} };
		
		String[][] heroShowTimeList = { {"15:15", "2관"}, {"19:00", "1관"}, {"21:00", "4D관"} };
		
		String[][] pororoShowTimeList = { {"16:20", "3관"}, {"17:40", "IMAX관"}, {"21:50", "3D관"} };
		
		movieTimeTable.put("아바타: 물의 길", avatarShowTimeList);
		movieTimeTable.put("올빼미", owlShowTimeList);
		movieTimeTable.put("코난 극장판: 베이커가의 망령", conanShowTimeList);
		movieTimeTable.put("영웅", heroShowTimeList);
		movieTimeTable.put("극장판 뽀로로와 친구들: 바이러스를 없애줘", pororoShowTimeList);
		
		Customer lim = new Customer("graceLim", 50000);
		Customer jeong = new Customer("sadoJeong", 50000);
		
		this.customers.add(lim);
		this.customers.add(jeong);
	}
	
	public static CinemaManager getInstance() {
		return cinemaManager;
	}

}
