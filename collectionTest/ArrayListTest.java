package collectionTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		int[] ar = {1,2,3};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// <> 안에는 저장할 값의 클래스타입을 써줘야 한다.
		// 또한 생성자 쪽의 <> 안은 생략이 가능하다.
//		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println(list);
		
		//값 추가하기
		//add()
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		
		System.out.println(list);
		
		// add(인덱스, 요소) : 해당 인덱스에 요소를 삽입한다.
		list.add(1, 100);
		System.out.println(list);
		
		// get(인덱스) : 인덱스에 위치한 값을 return
		System.out.println(list.get(1));
		
		// remove(인덱스) : 해당 인덱스의 요소를 삭제
		list.remove(0);
		System.out.println(list);
		
		// size() : 요소의 갯수를 return
		System.out.println(list.size());
		
		// isEmpty() : 비어있다면 true, 아니면 false가 return
		System.out.println(list.isEmpty());

		System.out.println("--------------------");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("--------------------");
		
		
		for (int num : list) {
			System.out.println(num);
		}
		
		
		System.out.println("--------------------");
		
		
		// ArrayList를 쓰는지 LinkedList를 쓰는지는 중요하지 않다.
		// List를 쓴다는 것이 중요하기에 앞쪽에 List라고 사용하기도 한다.
		List<String> list2 = new ArrayList<String>();
		
		LinkedList<String> llist = new LinkedList<String>();
		
		llist.add("안녕");
		System.out.println(llist);
		
		
		
		
		
	}
}
