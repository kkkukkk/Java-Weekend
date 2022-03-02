package hamburger;

import java.util.Scanner;

public class Hambuger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CODE = "0000";//초기 관리자코드

		int hamCnt = 0; // 햄버거 개수를 저장할 변수
		int gamCnt = 0; // 감자튀김 개수를 저장할 변수
		int colaCnt = 0;// 콜라 개수를 저장할 변수

		System.out.println("★오늘 하루도 힘내세요~!★\n");

		while (true) {
			System.out.println("★어서오세요 롯데리아입니다★\n");
			System.out.println("1.주문하기");
			System.out.println("2.마감하기");
			System.out.print("입력 >> ");
//			int choice = sc.nextInt();
//			sc.nextLine();
			int choice = Integer.parseInt(sc.nextLine());

			if (choice == 1) {
				// 주문하기
				hamCnt = 0;// 다음손님이 주문하기 했을때
				gamCnt = 0;// 기존손님의 갯수들을 0으로
				colaCnt = 0;// 초기화 해준다
				while (true) {
					System.out.println();
					System.out.println("-----메뉴판-----");
					System.out.println("|1.햄버거\t: 2000원|");
					System.out.println("|2.감자튀김\t: 2500원|");
					System.out.println("|3.콜라\t: 500원|");
					System.out.println("|4.결제하기         |");
					System.out.println("입력 >> ");
					choice = Integer.parseInt(sc.nextLine());
					// 장바구니에 물건을 담을 때마다 현재 담겨있는 갯수를 보여주기!
					// ----장바구니----
					// 햄버거 : 0개
					// 감자튀김 : 0개
					// 콜라 : 0개

					if (choice == 1) {
						hamCnt++;
						System.out.println("햄버거 1개가 장바구니에 추가되었습니다\n");
					} else if (choice == 2) {
						gamCnt++;
						System.out.println("감자튀김 1개가 장바구니에 추가되었습니다\n");
					} else if (choice == 3) {
						colaCnt++;
						System.out.println("콜라 1개가 장바구니에 추가되었습니다\n");
					} else if (choice == 4) {
						// 총금액 : 20000원
						// 금액입력 >> 25000
						// 결제완료!, 잔돈은 5000원입니다
						int price = 2000 * hamCnt + 2500 * gamCnt + 500 * colaCnt;

						System.out.println("총 가격은 " + price + "원 입니다");
						System.out.print("금액입력 >> ");
						int money = Integer.parseInt(sc.nextLine());
						int rest = money - price;

						if (rest > 0) {
							System.out.println("결제완료!, 잔돈은 " + rest + "원 입니다");
						} else {
							System.out.println("잔액이 부족합니다");
							System.out.println("추가금액 >> ");
							int don = Integer.parseInt(sc.nextLine());
							rest = rest + don;
							if (rest >= 0) {
								System.out.println("결제완료!, 잔돈은 " + rest + "원 입니다");
							}else {
								System.out.println("잔액이 부족합니다");
								System.out.println("추가금액 >> ");
								int don2 = Integer.parseInt(sc.nextLine());
								rest = rest + don2;
							}

							break;
						}

						break;

					} else {
						System.out.println("잘못입력했습니다 주문화면으로 이동합니다\n");
						continue;
					}
					System.out.println("----장바구니----");
					System.out.printf("햄버거 %d개\n", hamCnt);
					System.out.printf("감자튀김 %d개\n", gamCnt);
					System.out.printf("콜라 %d개\n", colaCnt);
					System.out.println("--------------");
					System.out.println();
				} // 주문 while문 닫는 중괄호

			} else if (choice == 2) {// 마감하기
				// 관리자 비밀번호 변경하기
				System.out.println("비밀번호 변경을 원할 시 \"변경\"을 입력하시오 >> ");
				String input = sc.nextLine();
				if (input.equals("변경")) {
					System.out.println("변경할 비밀번호 입력 >> ");
					CODE = sc.nextLine();
					System.out.println("비밀번호 수정됨");
					continue;
				}

				System.out.println("관리자 코드를 입력해 주세요\n");
				System.out.print("입력 >> ");
				String passward = sc.nextLine();

				if (passward.equals(CODE)) {
					System.out.println("오늘하루도 고생했습니다~");
					break;
				}
				System.out.println("잘못 입력했습니다 메인화면으로 돌아갑니다");
				System.out.println("--------------------------------\n");

			} else {
				// 잘못입력한부분
				System.out.println("잘못 입력했습니다 메인화면으로 이동합니다");
				System.out.println("--------------------------------\n");
			} // if문 닫는 중괄호

			System.out.println();
		} // 메인 while문 닫는 중괄호
	}

}
