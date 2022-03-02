package constrcutorTest;

public class Main {
	public static void main(String[] args) {
		Student s = new Student("±èÃ¶¼ö", 10, "ÃÊµîÇĞ±³");
		Student s2 = new Student();
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.school);
		
		
	}
}
