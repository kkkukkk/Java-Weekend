package day04;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		// 사용자에게 입력을 받아서, 해당 정수가 3의 배수라면 3의 배수입니다
		// 4의 배수라면 4의 배수입니다를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 3 == 0) {
			System.out.println("3의 배수입니다");
		}
		if (n % 4 == 0) {
			System.out.println("4의 배수입니다");
		}

//		int num = 5;
//		if (num <= 10) {
//			System.out.println("10보다 작아요");
//		}
//		if (num == 5) {
//			System.out.println("num은 5입니다");
//		}
	}
}
