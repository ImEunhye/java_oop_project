//package oopcinema;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//import oopcinema.cinema.snackbar.Menu;
//
//public class CinemaApplication2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// "Snack", [new Snack("쿠키"), new Snack("다이제")"]
//		// "Drink", [게토레이, 사이다]
////		Menu m = new Menu(snackList);
//		Scanner sc = new Scanner(System.in);
//
//		Map<String, List<String>> cinemaFoodList = new HashMap<>();
//		List<String> snackList = new ArrayList<>();
//		snackList.add("치즈팝콘");
//		snackList.add("어니언팝콘");
//		snackList.add("오징어다리");
//		
//		cinemaFoodList.put("snack", snackList);
//		
//		List<String> drinkList = new ArrayList<>();
//		drinkList.add("사이다");
//		drinkList.add("콜라");
//		drinkList.add("맥주");
//		cinemaFoodList.put("drink", drinkList);
//		
//		
//		Menu menu = new Menu(cinemaFoodList);
//		
//		Map<String, List<String>> foodList = menu.getMenuList(); // 메뉴에서 메뉴 리스트 가져옴
//		
//		System.out.println(foodList);
//		System.out.println("snack or drink : " + foodList.get(sc.next()));
//		
//		
//		
////		Set<String> keySet = map.keySet();s
////		Iterator<String> keyIterator = keySet.iterator();
////		while (keyIterator.hasNext()) {
////			String key = keyIterator.next();
////			Integer value = map.get(key);
////			System.out.println(key + " : " + value);
////		}
////		System.out.println();
//		
//	}
//
//}
//
//class Snack {
//	int price;
//}
