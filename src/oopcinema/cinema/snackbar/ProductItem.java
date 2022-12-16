package oopcinema.cinema.snackbar;

import lombok.Getter;
import lombok.ToString;

/**
 * Menu에 포함되는 항목 클래스
 * 
 * Field Summary
 * 1. 음료 이름 - String name
 * 2. 가격 - int price
 * 3. 준비 시간 - int preparingTime
 * 4. 인기도 - popular
 *
 * 
 * */

@ToString
@Getter
public class ProductItem {
	private String name;
	private int price;


	
	public ProductItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
