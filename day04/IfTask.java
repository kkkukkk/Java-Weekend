package day04;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		// 사용자에게 점수를 입력받아(int로 입력)
		// 점수가 90점 이상이면 A학점
		// 80이상, 90미만이면 B학점
		// 70이상, 80미만이면 C학점
		// 70미만 F학점
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 >> ");
		int score = sc.nextInt();
		/*
		 * if (score > 100 || score < 0) { System.out.println("잘못된점수입니다"); } else
		 */

		String res = "";
		if (score >= 90) {
//			System.out.print("A학점");
			res = "A학점";
		} else if (score >= 80) {
//			System.out.print("B학점");
			res = "B학점";
		} else if (score >= 70) {
//			System.out.print("C학점");
			res = "C학점";
		} else {
//			System.out.print("F학점");
			res = "F학점";
		}

		// 일괄 처리
		System.out.println("당신의 학점은 " + res + "입니다");

	}
}
