package day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<String>();
		System.out.println(fruits);
		
		// add() : 값 추가
		// Set는 순서가 없고, 중복을 허용하지 않는다
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("파인애플");
		fruits.add("포도");
		fruits.add("포도");
		fruits.add("포도");
		fruits.add("포도");
		fruits.add("포도");

		System.out.println(fruits);
		
		// remove() : 요소 삭제
		fruits.remove("사과");
		System.out.println(fruits);
		
		// size() : 크기
		System.out.println(fruits.size());
		
		// isEmpty() : 비어있다면 true, 아니면 false가 return
		System.out.println(fruits.isEmpty());
		
		
		// 세트는 반복문을 활용해야지만 값을 한 개씩 가져올 수 있다
		for( String element : fruits) {
			System.out.println(element);
		}
		
		System.out.println("-------------------");
		
		// iterator() : 순서를 부여해주는 메소드
		// int num = Integer.parseInt("10");
		Iterator<String> iter = fruits.iterator();
		
		// hasNext() : 다음 요소가 있으면 true, 없으면 false가 return
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		
		Iterator<Integer> it = nums.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}
}
