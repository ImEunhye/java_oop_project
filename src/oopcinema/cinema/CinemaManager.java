package oopcinema.cinema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import oopcinema.cinema.snackbar.DrinkItem;
import oopcinema.cinema.snackbar.Menu;
import oopcinema.cinema.snackbar.ProductItem;
import oopcinema.cinema.snackbar.SnackItem;
import oopcinema.cinema.snackbar.Staff;



/**
 	주문할 때 필요한 기본 데이터들 세팅 클래스 

 * Field Summary
 * 1. 스태프 직원들 - List<Staff> staffs
 * 2. 바리스타 직원들 - List<Barista> baristas;
 * 3. 메뉴판 - Menu menu;
 * 4. 음료 레시피 - List<Recipe> recipes;
 * 5. 손님들 - List<Customer> customers; 
 * 
 *  * while
 * private Hashmap<String snack : List<snacks>>;
 * 리스트가 
 */
@Getter
public class CinemaManager {
	private Menu snackMenu;
	private Menu drinkMenu;
    private String snackMenuName = "";
    private String drinkMenuName = "";
    private int count = 1;
	private static CinemaManager cinemaManager = new CinemaManager(); // 고유한 인스턴스

	// 기본 생성자의 접근 제어자를 private으로 지정하였기 때문에, 기본 생성자의 호출은 자신(CafeManager)만 가능
	private CinemaManager() {
        
        // 스낵 세팅
        ProductItem item1 = new ProductItem("치즈 팝콘", 8000);
        ProductItem item2 = new ProductItem("어니언 팝콘", 8000);
        ProductItem item3 = new ProductItem("오징어다리", 6000);
        ProductItem item4 = new ProductItem("나쵸", 6000);

        ProductItem[] menuItems = {item1, item2, item3, item4};
        List<ProductItem> snackMenuList = new ArrayList<>(Arrays.asList(menuItems));
        
        

        for(ProductItem i : snackMenuList) {
        	snackMenuName += (count++)+ "." + i.getName() + " ";
        }
        
        Menu snackMenu = new Menu("스낵 메뉴판", snackMenuList);
        this.snackMenu = snackMenu;

        // 메뉴판 세팅
        ProductItem drink1 = new ProductItem("콜라", 4000);
        ProductItem drink2 = new ProductItem("사이다", 4000);
        ProductItem drink3 = new ProductItem("맥주", 6000);
        ProductItem drink4 = new ProductItem("제로콜라", 4000);

        ProductItem[] drinkItems = {drink1, drink2, drink3, drink4};
        List<ProductItem> drinkMenuList = new ArrayList<>(Arrays.asList(drinkItems));
        
        count = 1;
        
        for(ProductItem i : drinkMenuList) {
        	drinkMenuName += (count++)+ "." + i.getName() + " ";
        }
        
        Menu drinkMenu = new Menu("스낵 메뉴판", drinkMenuList);
        this.drinkMenu = drinkMenu;
        
	}

	public static CinemaManager getInstance() {
		return cinemaManager;
	}
	

	
}



