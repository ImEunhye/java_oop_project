package oopcinema.cinema.ticketbox;

public class Movie {
	private String title;
	private MovieInfo movieInfo;
	
	public Movie(String title, MovieInfo movieInfo) {
		this.title = title;
		this.movieInfo = movieInfo;
	}

	@Override
	public String toString() {
		return title;
	}
	
}
