package classArray;

public class Main {
	public static void main(String[] args) {
		Student kim = new Student("±èÃ¶¼ö", 80);
		Student park = new Student("¹Ú¿µÈñ", 100);
		Student hong = new Student("È«±æµ¿", 50);

		int[] nums = { 10, 20, 30 };
		for (int n : nums) {

		}

		Student[] scores = { kim, park, hong };
		scores[0].show();
		System.out.println(scores[2].name);

		for (Student std : scores) {
			std.show();
		}

	}
}
