package objectTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 비밀번호 암호화
		
		final int KEY = 3;
		
		System.out.println("비밀번호 입력 : ");
		String pw = sc.nextLine();
		String en_pw = "";
		
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * KEY);
		}
		System.out.println("암호화된 pw : " + en_pw);
		System.out.println("-----------------------");
		// 암호화된 비밀번호를 복호화 하여 출력하기
		
		String or_pw = "";
		
		for (int i = 0; i < en_pw.length(); i++) {
			or_pw += (char)(en_pw.charAt(i) / KEY);	
		}
		System.out.println("복호된 pw : " + or_pw);
		
		
		// 사용자에게 전화번호를 입력받고, 해당 전화번호에서
		// - 를 지운 값을 출력하라
		// 010-0000-0000 --> 01000000000

		System.out.println("전화번호 입력 >>> ");
		String pn = sc.nextLine();
		
//		String[] pn_n = pn.split("-");
//		String pn_nn = String.join("", pn_n);
		
		pn = pn.replaceAll("-", "");
		
		System.out.println(pn);
		
		// 사용자에게 회원정보를 입력받는다(콤마를 통해 구분하여 입력받는다)
		// 10,배상엽,서울시
		// ---사용자 정보---
		// 이름 : 배상엽
		// 나이 : 10살
		// 주소 : 서울시
		
		System.out.println("사용자 정보 입력(나이,이름,주소) >>> ");
		String info = sc.nextLine();
		String[] s_info = info.split(",");

		System.out.println("---사용자 정보----");
		System.out.println("이름 : " + s_info[1]);
		System.out.println("나이 : " + s_info[0]);
		System.out.println("주소 : " + s_info[2]);
		
		// 사용자에게 한글로 숫자를 입력 받고, 해당 한글을 숫자로 변경해주는 프로그램
		
		System.out.print("입력 >> ");
		String input = sc.nextLine();
		String res = "";
		String hangeul = "공일이삼사오육칠팔구";
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			res += hangeul.indexOf(ch);
		}
		System.out.println(res);
		
	}
}
