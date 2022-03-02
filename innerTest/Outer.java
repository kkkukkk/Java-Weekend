package innerTest;

public class Outer {
	int ov = 10;
	
	class InnerInstance{ // 인스턴스클래스
		int iiv = 20;
		
	}
	
	static class InnerStatic{ // 스태틱 클래스
		int isv = 30;
	}
	
	public void f() {
		class InnerLocal{ // 지역클래스
			int ilv = 40;
		}
		// 지역 클래스는 f() 안에서 밖에 사용을 못한다.
		InnerLocal il = new InnerLocal();
		System.out.println(il.ilv);
	}
	
	
	
}



class Student{
	
}