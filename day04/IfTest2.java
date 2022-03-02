package day04;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자에게 두 정수를 입력 받아(업그레이드)
		// 둘 중 더 큰 수 출력하기 둘다 같은 수 라면 같다 고 출력하기
		// 입력예시
		// 정수입력 >> 20
		// 정수입력 >> 30
		System.out.print("정수입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("정수입력 >> ");
		int num2 = sc.nextInt();
		// 출력예시
		// 30
		System.out.println("---삼항연산자---");
		String result = num1 > num2 ? Integer.toString(num1) : num1 == num2 ? "같다" : num2 + "";
		System.out.println(result);

		// 자동 줄맞춤 : ctrl + shift + f

		System.out.println("---if문---");
		if (num1 > num2) {
			System.out.println("같다");
		} else if (num1 == num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			// num1 <= num2 들어오는 공간
			System.out.println("이 공간을 사용할 수 있다");
			if (num1 == num2) {
				System.out.println("같다");
			} else {
				System.out.println(num2);
			}
		}

	}
}
