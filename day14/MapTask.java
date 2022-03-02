package day14;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapTask {
	public static void main(String[] args) {
		// 메뉴판 제작 프로그램
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<>();

		while (true) {
			System.out.println("1. 메뉴 추가하기");
			System.out.println("2. 메뉴 수정하기");
			System.out.println("3. 메뉴 삭제하기");
			System.out.println("4. 전체 메뉴보기");
			System.out.println("5. 나가기");

			try {
				System.out.print(" 번호 선택 >>> ");
				int choice = Integer.parseInt(sc.nextLine());

				if (choice == 5) {
					break;
				} else if (choice == 1) {
					System.out.print("음식 입력 >> ");
					String food = sc.nextLine();
					System.out.print("가격 입력 >> ");
					int price = Integer.parseInt(sc.nextLine());
					// 사장님한테 음식이름과 가격을 입력받아서
					// 해당 메뉴 추가하기
					for (String a : menu.keySet()) {
						if (a.equals(food)) {
							System.out.println("동일한 메뉴가 존재합니다");
							break;
						}
					}
					menu.put(food, price);
					// 중복 될 경우 추가되면 안됨

				} else if (choice == 2) {
					boolean check = false;
					System.out.print("수정할 음식 입력 >> ");
					String food = sc.nextLine();
					// 사장님에게 음식 이름과 수정할 가격을 입력받아서
					for (String a : menu.keySet()) {
						if (a.equals(food)) {
							System.out.print("수정할 가격 입력 >> ");
							int price = Integer.parseInt(sc.nextLine());
							menu.put(food, price);
							check = true;
							break;
						}
					}
					if (check == false) {
						System.out.println("음식이 존재하지 않습니다");
					}
					// 해당 메뉴의 가격 수정하기
					// 메뉴가 없으면 수정 불가능

				} else if (choice == 3) {
					// 사장님에게 음식 이름을 입력받아서
					boolean check = false;
					System.out.print("삭제할 음식 입력 >> ");
					String food = sc.nextLine();
					// 해당 메뉴 삭제하기
					for (String a : menu.keySet()) {
						if (a.equals(food)) {
							menu.remove(food);
							System.out.println(food + "를 삭제했습니다");
							check = true;
							break;
						}
					}
					if (check == false) {
						System.out.println("음식이 존재하지 않습니다");
					}
					// 메뉴가 없으면 삭제 불가능

				} else if (choice == 4) {
					// -----카페메뉴-----
					// 아메리카노 : 1500원
					// 카페라떼 : 2000원
					// ---------------
					// 메뉴가 없을경우 메뉴가 아직 없습니다.
					System.out.println("-----카페메뉴-----");
					for (Entry<String, Integer> a : menu.entrySet()) {
						System.out.println(a.getKey() + " : " + a.getValue());
					}
					System.out.println("----------------\n");

				} else {
					System.out.println("잘못 입력했습니다.");
				}
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다.");
			}

		}

	}
}
