package day06;

public class ForReview {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			// 첫번째 i : 0
			// 두번째 i : 1
			// 세번째 i : 2
			// ...
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		String star = "*";
		for (int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*"; // star = star + "*";
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = 4 - i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		star = "*";
		for (int i = 0; i < 5; i++) {
			System.out.printf("%5s\n", star);
			star += "*";
		}

		// 구구단 2단부터 9단까지 출력하기
		for (int dan = 2; dan <= 9; dan++) {
			
			System.out.println("----"+ dan +"단----");
			for (int i = 1; i <= 9; i++) {
				System.out.println( dan +" x " + i + " = " + dan * i);
			}
		}
	}
}
