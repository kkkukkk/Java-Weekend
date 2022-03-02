package accessTest;

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
//		t.pri = 10; private 변수는 다른 클래스에서 사용 불가
		t.def = 10;
		t.pro = 10;
		t.pub = 10;
		
//		t.prif(); private 메소드는 다른 클래스에서 사용 불가
		t.deff();
		t.prof();
		t.pubf();
		
		
		Student kim = new Student();
//		kim.name = "김철수";
		
		kim.setName("김철수");
//		kim.kor = 90;
		kim.setKor(90);
		kim.setEng(70);
		kim.eng = 10000;
//		kim.kor = 10000;
		kim.setKor(10000);
//		System.out.println(kim.name);
		System.out.println(kim.getName() + "님");
//		System.out.println("국어 : " + kim.kor);
		System.out.println("국어 : " + kim.getKor());
		System.out.println("영어 : " + kim.getEng());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
