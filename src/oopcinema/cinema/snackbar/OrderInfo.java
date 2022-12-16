package oopcinema.cinema.snackbar;


import java.util.List;

import lombok.Getter;

/**
 * 주문 정보(OrderInfo) 클래스
 * 주문(Order) 클래스의 필드로 구성됨
 * 
 * Field Summary
 * 1. 주문 음료명 - String drinkName - 필수 필드
 * 2. 주문 날짜 - LocalDateTime orderDate - 필수 필드
 * 3. 주문 담당자 - List<Employee> managers - 필수 필드
 * 4. 테이크아웃 여부 - boolean takeOut; - 선택 필드
 * 5. 주문 요청 사항 - String customerRequirement - 선택 필드 
 */
@Getter
public class OrderInfo {
	
	private DrinkItem drinkName;
	private SnackItem snackName;
	private List<Staff> staff;
	private int change;
	
	
	private OrderInfo(Builder builder) {
		this.drinkName = builder.drinkName;
		this.snackName = builder.snackName;
		this.change = builder.change;
		this.staff = builder.staff;
	}
//	
//	// 빌더 패턴
	public static class Builder { // Builder: 만들어주는 사람
		
		// 필수 필드
		private ProductItem drinkName;
		private ProductItem snackName;
		private List<Staff> staff;
		private int change;
		
		
		// 필수 필드를 세팅해주는 생성자
		public Builder(ProductItem drinkName, ProductItem snackName, List<Staff> staff, int change) {
			this.drinkName = drinkName;
			this.snackName = snackName;
			this.staff = staff;
			this.change = change;
		}
		
		
		public OrderInfo build() {
			return new OrderInfo(this);
		}
	}
	
}









