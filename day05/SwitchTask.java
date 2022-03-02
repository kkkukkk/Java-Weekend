package day05;

import java.util.Scanner;

public class SwitchTask {
	public static void main(String[] args) {
		// 1. 사용자에게 월을 입력받아서 해당 월의 마지막 일 알려주기
		// (2월은 28일이라고 가정한다), 잘못된 월 입력시 잘못된 월입니다 출력하기
		// ex 5
		// 입력하신 월의 마지막 일은 31일입니다
		Scanner sc = new Scanner(System.in);
//		System.out.print("월 입력 >> ");
//		int month = sc.nextInt();
//		int day = 0;
//		switch (month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			System.out.println("입력하신 월의 마지막 일은 31일 입니다");
//			break;
//		case 1, 3, 5, 7, 8, 10, 12:
//			day = 31;
//			break;
//		case 4, 6, 9, 11:
//			day = 30;
//			break;
//		case 2:
//			day = 28;
//			break;
//		default:
//			System.out.println("잘못된 월입니다");
//		}
//		// 잘못입력한 경우에는 출력 안되게 만들기
//		// 잘못 입력한 경우에는 switch문이 끝난 경우에도 day에 0이 들어있다
//		if (day != 0) {//잘못 입력하지 않았다면
//			System.out.println("입력하신 월의 마지막 일은 " + day + "일 입니다");
//		}
//		if (month >= 1 && month <= 12) {
//			System.out.println("입력하신 월의 마지막 일은 " + day + "일 입니다");
//		}

		// 2.사용자에게 점수(int)를 입력받아
		// 90이상 100이하 : 당신의 학점은 A입니다
		// 80이상 90미만 : 당신의 학점은 B입니다
		// 70이상 80미만 : 당신의 학점은 C입니다
		// 70미만 : 당신의 학점은 F입니다
		System.out.print("점수 >> ");
		int score = sc.nextInt();
		String grade = "";
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
		}

		System.out.println("당신의 학점은 " + grade + "입니다");

	}
}
