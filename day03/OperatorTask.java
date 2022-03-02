package day03;

import java.util.Scanner;

public class OperatorTask {
	public static void main(String[] args) {
		// 1. 사용자에게 정수를 입력받고, 해당 정수의 십의자리와 일의자리를 출력하라
		// 입력예시
		// 정수 입력 >> 95
		// 출력예시
		// 십의자리 : 9
		// 일의자리 : 5
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 >> ");
		int num = scan.nextInt();
		int num1 = num/10;
		int num2 = num%10;
		//System.out.printf("십의자리 : %d\n일의자리 : %d\n", num1, num2);
		System.out.println("십의자리 : " + num1);
		System.out.println("일의자리 : " + num2);
		// 2. 노래 한 곡당 300원인 코인노래방이 있다
		// 사용자에게 금액을 입력 받고, 부를 수 있는 노래와 잔돈을 출력하라
		// 입력예시
		// 금액 입력 >> 2000
		// 출력예시 
		// 부를 수 있는 노래는 6곡이며, 200원이 반환되었습니다.
		
		System.out.println("금액 입력 >> ");
		int price = scan.nextInt();
		int cost = 300;
		
		int song = price/cost;
		int rest = price%cost;
		
		//System.out.printf("부를 수 있는 노래는 %d곡이며, %d원이 반환되었습니다.\n", song, rest);
		System.out.println("부를 수 있는 노래는 "+song+"곡이며, "+rest+"원이 반환되었습니다");
		// 3. 사용자에게 국어점수, 수학점수를 입력 받아 평균을 출력하라
		// 국어점수 >> 80
		// 수학점수 >> 81
		// 당신의 평균은 80.5점 입니다.
		
		System.out.println("국어점수 >> ");
		double kor = scan.nextDouble();
		scan.nextLine();
		System.out.println("수학점수 >> ");
		double math = scan.nextDouble();
		double avg = (kor+math)/2;
		System.out.printf("당신의 평균은 %.1f점 입니다.\n", avg);
//		System.out.printf("당신의 평균은 " + (double)(kor+math)/2 + "점 입니다.");
	}
}

