package day15;

import java.util.HashMap;
import java.util.Scanner;

public class MapTask {
	// key값이 해당 해시맵에 존재하는지 안하는지 판단하는 메소드
	// continsKey() --> key값이 맵에 존재하면 true, 아니면 false
	public static boolean containsKey(HashMap<String, Integer> map, String key) {
		for(String temp : map.keySet()) {
			if(temp.equals(key)) {
				// 중복된 key가 존재한다는 의미
				return true;
			}
		}
		
		return false;	
		
	}
	
	
	
	
	public static void main(String[] args) {
		// 카페 메뉴판 제작 프로그램
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<String, Integer>();

		while (true) {
			System.out.println("1. 메뉴 추가하기");
			System.out.println("2. 메뉴 수정하기");
			System.out.println("3. 메뉴 삭제하기");
			System.out.println("4. 전체 메뉴보기");
			System.out.println("5. 나가기");
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 5) {
				break;
			} else if (choice == 1) {
				// 사장님한테 음식 이름과 가격을 입력 받아서
				System.out.print("추가할 메뉴 : ");
				String name = sc.nextLine();
				
				
//				boolean check = false;
//				
//				for(String key :menu.keySet()) {
//					if(key.equals(name)) {
//						// 중복된 키값이 존재한다는 의미
//						check = true;
//						break;
//					}
//				}
				
//				if(check) {
//					System.out.println("해당 메뉴가 이미 존재합니다");
//					continue;
//				}
				
				if(MapTask.containsKey(menu, name)) {
					System.out.println("해당 메뉴가 이미 존재합니다");
					continue;
				}
				// 해당 메뉴 추가하기
				System.out.print("가격 : ");
				int price = Integer.parseInt(sc.nextLine());
				
				menu.put(name, price);
				
				System.out.println("추가 성공!");
				
				
			} else if (choice == 2) {
				// 사장님에게 음식 이름과 수정할 가격을 입력 받아서
				System.out.print("수정할 메뉴 : ");
				String name = sc.nextLine();
				
				if(MapTask.containsKey(menu, name)) {
					System.out.println("수정할 가격 : ");
					int price = Integer.parseInt(sc.nextLine());
					
					menu.put(name, price);
				}else {
					System.out.println("해당 메뉴가 존재하지 않습니다");
				}
				
				
				// 해당 메뉴의 가격 수정하기
			} else if (choice == 3) {
				// 사장님에게 음식 이름을 입력 받아서
				System.out.print("메뉴 입력 >> ");
				String name = sc.nextLine();
				// 해당 메뉴 삭제하기
				
				if(menu.containsKey(name)) {
					menu.remove(name);
					System.out.println("삭제성공!");
				}else {
					System.out.println("존재하지 않는 메뉴입니다");
				}
				
			} else if (choice == 4) {
				// -----카페메뉴-----
				System.out.println("----카페메뉴----");
				for(String key : menu.keySet()) {
					// 아메리카노 : 1500원
					// 카페라테 : 2000원
					System.out.println(key + " : " + menu.get(key));
				}
				// ----------------
				System.out.println("--------------");
			} else {
				System.out.println("잘못입력했습니다");
			}

		}
		
		
		
		
		
		
		

	}
}
