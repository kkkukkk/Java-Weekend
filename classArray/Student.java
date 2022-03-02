package classArray;

public class Student {
	String name;
	int score;
	
	//초기화 생성자 단축키
	// alt + shift + s > o > enter
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void show() {
		System.out.println("----학생정보----");
		System.out.println("이름 : " + this.name);
		System.out.println("성적 : " + this.score);
	}



	
	
	
	
	
	
	
	
	
	
	
}
