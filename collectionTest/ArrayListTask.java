package collectionTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 회원 1명에 대한 4개의 값(이름,나이,아이디,비밀번호)은
		// User 타입의 객체에 담아준다.
		
		// 여러개의 User 타입의 객체는 ArrayList에 저장하겠다.
		ArrayList<User> list = new ArrayList<User>(); //회원정보가 저장된 리스트
		
		
		while(true) {
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보보기");
			System.out.println("4.나가기");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice == 4) {
				break;
			}else if(choice == 1) {
				User u = new User(); // 회원 1명에 대한 정보를 저장할 객체
				
				System.out.print("이름 입력 >> ");
				u.name = sc.nextLine();
				
				System.out.print("나이 입력 >> ");
				u.age = Integer.parseInt(sc.nextLine());
				
				System.out.print("id 입력 >> ");
				u.id = sc.nextLine();
				
				System.out.print("pw 입력 >> ");
				u.pw = sc.nextLine();
				
				list.add(u);
				
				
			}else if(choice == 2) {
				
			}else if(choice == 3) {
				
			}else {	
				System.out.println("잘못 입력했습니다");
			}
			
			
		}
	}
}
