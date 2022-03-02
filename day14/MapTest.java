package day14;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		
		System.out.println(scores);
	
		// put() 추가
		scores.put("국어", 80);
		scores.put("영어", 70);
		scores.put("수학", 100);
		scores.put("과학", 100);
		System.out.println(scores);
		
		// size() : 요소의 갯수를 return
		System.out.println(scores.size());
		
		// isEmpty() : 비어있다면 true, 아니면 false
		System.out.println(scores.isEmpty());
		
		// get(key) : key에 해당하는 value를 return
		System.out.println(scores.get("국어"));
		
		// remove(key) : 삭제
		scores.remove("과학");
		System.out.println(scores);
		
		// keySet() : key 값들이 들어있는 Set가 리턴된다
		System.out.println(scores.keySet());
		
		// values() : value 값들이 들어있는 Collection이 return된다
		System.out.println(scores.values());
		
		// entrySet() : Entry 객체가 들어있는 Set가 return
		System.out.println(scores.entrySet());
		
		
		for(String k : scores.keySet()) {
			System.out.println(k + scores.get(k));
		}
		
		for(Entry<String, Integer> e: scores.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		HashMap<Integer, HashMap<String,String>> info = new HashMap<>();
		
		HashMap<String,String> s1 = new HashMap<String, String>();
		s1.put("이름", "김철수");
		s1.put("나이", "20");
		s1.put("학과", "IT");
		info.put(202001, s1);
		
		HashMap<String,String> s2 = new HashMap<String, String>();
		s2.put("이름", "박영희");
		s2.put("나이", "25");
		s2.put("학과", "컴퓨터");
		info.put(2017001, s2);
		
		System.out.println(info);
		
		System.out.println(info.get(2017001).get("학과"));
		
		s2.put("학과", "IT");
		info.put(2017001, s2);
		System.out.println(info);
		
	}
}
