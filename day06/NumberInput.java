package day06;

import java.util.Scanner;

public class NumberInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine());
		int num2 = sc.nextInt();
		
		System.out.println("num1 : " + num1 + " num2 : " + num2);
	}
}
