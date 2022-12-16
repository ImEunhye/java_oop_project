package oopcinema.cinema.snackbar;
import java.util.Scanner;

import lombok.Getter;
import oopcinema.cinema.CinemaManager;
import oopcinema.common.Person;

/**
 * 고객은 음료(Drink)를 주문할 수 있음
 * 고객은 음료 주문시 금액을 결제, 지불해야함
 * 
 * Field Summary
 * 1. 카페에서 사용할 주문용 닉네임 - String nickName;
 * 2. 카페에서 사용할 금액 - int balance;
 * 3. 사용자 메타 정보 - CustomerInfo customerInfo;
 * 
 * Method Summary
 * 1. 메뉴 보기 - Menu checkMenu()
 * 2. 메뉴 결정, 스태프에게 음료 주문 및 결제 - void confirmMenu()
 */
@Getter
public class Customer extends Person {
	private String nickName;
	private int balance;
	
	public Customer(String nickName, int balance) {
		super();
		this.nickName = nickName;
		this.balance = balance;
	}

	// 아무 접근 제어자도 작성하지 않았기 때문에 package-private(default), 같은 패키지 내에서만 접근 가능
	public void checkMenu() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("사랑을 드리는 CGV입니다. 주문하시겠습니까?");
		
		//스낵주문
		System.out.println(CinemaManager.getInstance().getSnackMenuName());
		System.out.print("주문하실 메뉴의 번호를 입력해주세요 : ");
		int snackSelectedNum = (sc.nextInt() - 1 );
		ProductItem snackMenuSelected = (ProductItem)CinemaManager.getInstance().getSnackMenu().getMenuList().get(snackSelectedNum);
		
		//음료주문
		System.out.println(CinemaManager.getInstance().getDrinkMenuName());

		System.out.print("주문하실 음료의 번호를 입력해주세요 : " );
		int drinkSelectedNum = (sc.nextInt() - 1 ) ;
		ProductItem drinkMenuSelected = (ProductItem)CinemaManager.getInstance().getDrinkMenu().getMenuList().get(drinkSelectedNum);
		
		//잔액조회
		int totalAmount = snackMenuSelected.getPrice() + drinkMenuSelected.getPrice();
		
		//멤버십조회
		
		
		//메뉴확인
		System.out.println("주문하신 메뉴는 " + snackMenuSelected.getName() +" " + snackMenuSelected.getPrice() + "원, "+ drinkMenuSelected.getName() + " "+ +drinkMenuSelected.getPrice()+ "원, 총 "+ totalAmount +"원 입니다." );
		
		System.out.println(nickName +"고객님 거스름 돈은 " + (balance - totalAmount) + "원 입니다.");

		
	}
}





