package day08;

public class ClassTest {
	public static void main(String[] args) {
		int num = 10;
		// kim : 객체, 인스턴스
		// Student() : 생성자
		Student kim = new Student(); // 객체화

		Student hong = new Student();

		hong.name = "홍길동";
		hong.kor = 80;
		hong.eng = 70;

		kim.name = "김철수";
		kim.eng = 70;
		kim.kor = 80;

		// hong이라는 객체를 만들어서
		// 해당 객체에 홍길동, 국어 : 80, 영어 : 70 인 학생 정보를 저장하라

//		System.out.println("---학생정보---");
//		System.out.println("이름 : "+ kim.name);
//		System.out.println("국어 : "+ kim.kor);
//		System.out.println("영어 : "+ kim.eng);

		// 길동이 학생정보 출력하기
		kim.show();
		hong.show();
		
	}
}

class Student {
	// 클래스 영역 : 필드
	String name; // 멤버, 멤버 변수, 인스턴스 변수
	int kor;// 멤버, 멤버 변수, 인스턴스 변수
	int eng;// 멤버, 멤버 변수, 인스턴스 변수

	public void show() {// 멤버, 멤버 함수 == 메소드
		System.out.println("---학생정보---");
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
	}
}
