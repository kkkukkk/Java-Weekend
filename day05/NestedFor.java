package day05;

public class NestedFor {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			// System.out.println("바깥 for문 안쪽");
			for (int j = 0; j < 3; j++) {
				System.out.println("i : " + i + " j : " + j);
				// System.out.println("안쪽 for문 안쪽");
			}
		}

		/*
		 * ***** ***** ***** ***** *****
		 */
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * * ** *** **** *****
		 * 
		 */

		/*
		 * * ** *** **** *****
		 * 
		 * 
		 */

		// 구구단 2단부터 9단까지 출력하기
		int x = 2;
		int y = 9;
		
		for ( ; x < y+1; x++) {
			for (int i = 1; i < 10; i++) {
				System.out.println(x + "x" + i + "=" + x * i);
			}
		}

	}
}
