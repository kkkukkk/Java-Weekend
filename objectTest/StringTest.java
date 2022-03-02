package objectTest;

import java.util.Iterator;
import java.util.Scanner;

public class StringTest {
	// 우리만의 조인 메소드 만들기
	public static String join(String s, String[] ar) {
		String res = "";
		for (int i = 0; i < ar.length; i++) {
			if (i == ar.length - 1) {
				res += ar[i];
				break;
			}
			res += ar[i] + s;
		}
		return res;
	}

	public static void main(String[] args) {
		// length() : 문자열의 길이를 return 한다
		System.out.println("apple".length());

		// charAt(idx) : 해당 문자열에서 인덱스번호에 해당하는 char를 return한다
		System.out.println("apple".charAt(0));

		// 사용자에게 영어로 된 문자열을 입력받아서
		// 대문자를 소문자로, 소문자를 대문자로 바꾸어 출력하시오

		Scanner sc = new Scanner(System.in);
//		System.out.println("문자열 입력 >> ");
		String abc = "ddd";
		String res = "";

		for (int i = 0; i < abc.length(); i++) {
			char c = abc.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				res += (char) (c + 32);
			} else if (c >= 'a' && c <= 'z') {
				res += (char) (c - 32);
			} else {
				res += c;
			}
		}
		System.out.println(res);

		System.out.println("---------------------");
//		indexOf(문자) : 해당 문자열에서 해당 문자의 index번호를 return

		// 반복되는 문자의 경우 앞의 문자 인덱스를 return한다.
		System.out.println("apple juice".indexOf('e'));

		// 찾기 시작할 인덱스 번호를 설정할 수 있다
		System.out.println("apple juice".indexOf('e', 5));

		// 없는 문자의 경우 -1이 return
		System.out.println("apple juice".indexOf('f'));

		// 문자열도 사용 가능, 앞 글자부터
		System.out.println("apple juice".indexOf("ui"));

		// 사용자에게 문자열을 입력 받아서
		// 두번째 o 의 위치 인덱스를 출력하라

		System.out.println("문자열 입력");
		String input = "aaoaaap3o90";
		System.out.println(input.indexOf('o', input.indexOf('o') + 1));

		// substring(시작인덱스) : 시작 인덱스부터 문자열을 잘라내는 메소드
		System.out.println("안녕하세요반갑습니다.".substring(4));

		// substring(시작인덱스, 끝인덱스) : 시작인덱스부터 끝인덱스-1 까지 문자열을 잘라내는 메소드
		System.out.println("안녕하세요반갑습니다.".substring(4, 6));

		// 사용자에게 문자열을 입력받아서 o 부터 끝까지 잘라내기
		input = "dadfoasdfadf";
		System.out.println(input.substring(input.indexOf('o')));

		// split(문자열) : 괄호 속 문자열을 기준으로 쪼갠 String[]을 return
		String[] ar = "apple juice is delicious".split("e");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		// join(문자열, 배열) : static 메소드
		// String.join()
		System.out.println(String.join("!", ar));
		
		System.out.println(StringTest.join("!", ar));

	}
}
