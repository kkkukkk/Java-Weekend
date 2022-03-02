package day13;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 >> ");
		int num = sc.nextInt();

		if (num == 1) {
			try {
				throw new ArithmeticException("1이 입력됨");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("정상 입력됨");
	}
}
