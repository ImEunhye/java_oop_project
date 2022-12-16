package oopcinema.cinema.theater;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Theater {
	private String name;
	private int capacity;
	private	String theaterType;
	private MovieProjector movieprojector;
	
	
}
