package day03;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		//나이를 입력받고, 이름을 입력받기
		Scanner scan = new Scanner(System.in);
		/*System.out.println("나이 입력 >> ");
		int age = scan.nextInt(); //숫자형은 숫자값만 가져올 수 있어서 \n(enter)이 버퍼에 남음
		scan.nextLine(); //버퍼에 남아있는 값을 받아서 비워줌
		System.out.println("이름 입력 >> ");
		String name = scan.nextLine();
		System.out.printf("나이 : %d, 이름 : %s\n", age, name);*/
		
		// 1. 나이를 입력받는다
		// 2. 이름을 입력받는다
		// 000님의 나이는 00살입니다. 단, 나이는 nextInt()
		// 이름은 enxtLine()을 사용할것
		System.out.println("나이 입력 >> ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("이름 입력 >> ");
		String name1 = scan.nextLine();
		System.out.printf("%s님의 나이는 %d살입니다.\n", name1, age);
		
		// 1. 키를 입력받는다
		// 2. 이름을 입력받는다
		// 000님의 키는 00.00cm입니다. 단, 키는 nextDouble()
		// 이름은 nextLine()을 사용할 것
		System.out.println("키 입력 >> ");
		double height = scan.nextDouble();
		scan.nextLine();
		System.out.println("이름 입력 >> ");
		String name2 = scan.nextLine();
		System.out.printf("%s님의 키는 %.2fcm입니다.\n", name2, height);
		
		// 1. 이름을 입력받는다
		// 2. 주소를 입력받는다
		// 000님 000 000에 거주 중입니다. 단, 이름은 next()
		// 주소는 nextLine()을 사용할것
		System.out.println("이름 입력 >> ");
		String name3 = scan.next();
		scan.nextLine();
		System.out.println("주소 입력 >> ");
		String addr = scan.nextLine();
		System.out.printf("%s님 %s에 거주중입니다.\n", name3, addr);
		
		
	}
}
