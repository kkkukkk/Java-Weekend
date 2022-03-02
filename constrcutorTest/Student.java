package constrcutorTest;

public class Student extends Person{
	String school;
	
	public Student(){
		super(null, 0);
	}
	
	public Student(String name, int age, String school) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.school = school;
	}

}
