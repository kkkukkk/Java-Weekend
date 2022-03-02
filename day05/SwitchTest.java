package day05;

public class SwitchTest {
	public static void main(String[] args) {
		int num = 5;
		// ctrl + alt + 위아래화살표 : 복사
		// alt + 위아래화살표 : 이동
		System.out.println("---if---");
		if (num == 5) {
			System.out.println("5입니다");
		} else if (num == 1) {
			System.out.println("1입니다");
		} else {
			System.out.println("그외입니다");
		}

		System.out.println("---switch---");
		switch (num) {
		case 5:// num == 5
			System.out.println("5입니다");
			break;
		case 1:// num == 1
			System.out.println("1입니다");
			break;
		default://위가 모두 거짓일때
			System.out.println("그외입니다");
//			break;
		}

	}
}
