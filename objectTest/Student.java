package objectTest;

public class Student {
	int num;
	String name;
	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.num;
	}
	
	@Override
	public String toString() {
		return num+"¹ø ÇÐ»ý" + name;
	}
	
}
