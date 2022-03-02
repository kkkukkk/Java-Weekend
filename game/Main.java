package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 게임을 만들 공간
//		Animal test = new Animal(10,10);
//		test.rest();
//		Dog d = new Dog(50,20);
//		d.rest();

		Scanner sc = new Scanner(System.in);

		Animal avatar = null;

		System.out.println("캐릭터를 선택하시오");
		System.out.println("1. 강아지");
		System.out.println("2. 호랑이");
		System.out.println("3. 고양이");
		System.out.println("(만약 해당 숫자를 제외하면 강아지가 선택됩니다)");
		int choice = sc.nextInt();

		if (choice == 2) {
			// Tiger 타입의 객체를 업캐스팅
			avatar = new Tiger(50, 50);
		} else if (choice == 3) {
			// Cat 타입의 객체를 업캐스팅
			avatar = new Cat(50, 50);
		} else {
			// Dog 타입의 객체를 업캐스팅
			avatar = new Dog(50, 50);
		}

		System.out.println("--게임 시작--");
		while (true) {
			System.out.println("1.먹기");
			System.out.println("2.산책가기");
			System.out.println("3.잠자기");
			System.out.println("4.게임종료");
			choice = sc.nextInt();

			if (choice == 4) {
				break;
			} else if (choice == 1) {
				// 자식타입에 재정의된 eat()이 실행됨
				avatar.eat();
			} else if (choice == 2) {
				// 자식타입에 재정의된 walk() 실행됨
				avatar.walk();
			} else if (choice == 3) {
				// 자식타입에 재정의된 rest() 실행됨
				avatar.rest();
			} else {
				System.out.println("잘못입력했습니다.");
			}
		}

//		avatar.onlyTiger(); 업캐스팅이 되면 자식에서 새롭게 만든 메소드는 사용할 수 없다.

		if (avatar instanceof Tiger) {// 다운캐스팅 전에 타입 확인
			Tiger t = (Tiger) avatar; // 다운캐스팅
			t.onlyTiger();
		}

	}
}
