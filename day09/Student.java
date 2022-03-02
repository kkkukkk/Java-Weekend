package day09;

public class Student {
	String name;
	int kor;
	int eng;

	// 클래스 안에 생성자가 직접 정의 되어있지 않다면
	// 컴파일러가 알아서 기본 생성자를 추가해준다
	// 생성자가 직접 정의되어있다면 기본생성자를 추가해주지 않는다
	
	// 따라서 기본 생성자와 초기화 생성자 모두를 사용하고 싶다면
	// 오버로딩하면 된다
	public Student() {;}
	
	// 초기화 생성자(인스턴스 변수에 초기값을 넣어주는 생성자)
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	// 인스턴스 변수 name, kor, eng에 값을 설정해주는 메소드 만들기
	public void setVariables(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void show() {
		System.out.println("---학생정보---");
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + this.kor);
		System.out.println("영어점수 : " + this.eng);
		System.out.println("-------------");
	}

}
