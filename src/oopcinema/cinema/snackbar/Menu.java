package oopcinema.cinema.snackbar;

import java.util.List;

import lombok.Getter;

/**
 * 카페 메뉴 클래스
 * Field Summary
 * 1. 메뉴 분류 - private Hashmap<String snack : List<snacks>>;
 * 								String snack (ex) snack, drink  
 * 											List 엔 snacks (ex) 치즈, 어니언
 *
 * 2. 메뉴 분류 - String snack;
 * 3. 메뉴 아이템 - List<MenuItem> menuList;
 *
 */

@Getter
public class Menu {
	private String title;
	private List menuList;
	
	public Menu(String title, List menuList) {
		super();
		this.title = title;
		this.menuList = menuList;
	}

	@Override
	public String toString() {
		return "Menu [menuList=" + menuList + "]";
	}
	
	

}



