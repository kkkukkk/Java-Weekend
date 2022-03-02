package day05;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		// 10 9 8 7 ... 1 출력하기

		System.out.println();
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("--1부터 입력받은 숫자까지 구하기--");
		// 1부터 입력받은 숫자까지 총합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("몇까지 더해줄까요 >> ");
		int target = sc.nextInt();

		int k = 1;
		for (int i = 0; i < target; i++) {
			k += i + 1;
		}
		System.out.println("총합 = " + (k - 1));

		k = target * (target + 1) / 2;
		System.out.println("총합 = " + k);

		System.out.println("--1부터 100까지의 숫자 중 짝수만 출력하기--");
		// 1부터 100까지의 숫자 중 짝수만 출력하기
		
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 1) {
				continue; // 반복문안에서 사용되며 즉시 다음반복으로 이동한다
//				System.out.println("안녕"); dead code
			}
			System.out.println(i + " ");
		}

		// ----3단----
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 9 = 9
		// ...
		// 3 x 4 = 270
		System.out.println("--구구단 3단 출력하기--");
		System.out.println();
		
		System.out.println("몇 단을 출력할까요?");
		int x = sc.nextInt();
		System.out.println("몇 까지 출력할까요?");
		int y = sc.nextInt();
		for (int i = 1; i < y+1; i++) {
			System.out.println(x + "x" + i + "=" + x * i);
		}
		
			

	}
}
