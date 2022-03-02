package accessTest;

public class Student {
	private String name;
	private int kor;
	int eng;
	
	
	// 세터 : private 변수에 값을 저장하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		if(kor >= 0 && kor <= 100) {			
			this.kor = kor;
		}
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 게터 : private 변수에 들어있는 값을 되돌려주는 메소드
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	
	
	
	
}

















