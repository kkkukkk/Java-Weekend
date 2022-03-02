package day07;

import java.util.Scanner;

public class DoubleArrayTask {
	public static void main(String[] args) {
		// 월세 설정 프로그램
		Scanner sc = new Scanner(System.in);
		// 1. 일괄 월세 설정
		// 2. 층별 월세 수익 계싼
		// 3. 나가기

		int[][] house = {
				// 1호 2호 3호
				/* 1층 */ { 10, 20, 30 },
				/* 2층 */ { 100, 200, 300 } };

		while (true) {
			System.out.println("1. 개별 월세 설정");
			System.out.println("2. 층별 월세 수익 계산");
			System.out.println("3. 설정된 월세 보기");
			System.out.println("4. 나가기");
			int choice = sc.nextInt();
			
			if (choice == 4) {
				break;
			} else if (choice == 1) {
				// 사용자에게 층과 호수를 입력 받아서
				System.out.print("층 입력 >> ");
				int floor = sc.nextInt(); // 1(층)
				System.out.print("호수 입력 >> ");
				int ho = sc.nextInt(); // 1(호)
				// 배열의 알맞은 방에 월세를 설정해준다
				System.out.print("설정 월세 >> ");
				house[floor - 1][ho - 1] = sc.nextInt();

				System.out.println("설정 완료!");

			} else if (choice == 2) {
				// 수익을 보고 싶은 층을 선택해서
				System.out.print("층 입력 >> ");
				int floor = sc.nextInt();
				// 월세 총 합을 보여준다
				int total = 0;
				for (int fee : house[floor - 1]) {
					total += fee;
				}
				System.out.println(floor + "층 월세 총 합: " + total);

			} else if (choice == 3) {
				// 1층 1호 : 00만원
				// 1층 2호 : 00만원
				// 1층 3호 : 00만원
				// 2층 1호 : 00만원
				// 2층 2호 : 00만원
				// 2층 3호 : 00만원
				// house.length : 2
				for (int i = 0; i < house.length; i++) {
					// house[0].length : 3
					// house[1].length : 3
					for (int j = 0; j < house[i].length; j++) {
						System.out.println((i + 1) + "층" + (j + 1) + "호 : " + house[i][j]);
					}
				}

			} else {
				System.out.println("잘못 입력했습니다.");
			}
		}

	}
}
