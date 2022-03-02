package day14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> names = new HashSet<String>();
		
		while(true) {
			System.out.print("이름을 입력 >> ");		
			String input = sc.nextLine();
			
			if(input.equals("종료")) break;
			
			names.add(input);			
		}
		
		Iterator<String> i  = names.iterator();
		System.out.print("반에는 ");
		while(i.hasNext()) {
			System.out.print("[" + i.next() + "]");
		}
		System.out.print(names.size() + "개의 이름이 존재합니다");
	}
}
