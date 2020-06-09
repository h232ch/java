package map;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("삼합", 100);
		hm.put("곱배기", 200);
		
		System.out.println(hm.keySet());
		
		System.out.println("맵에 저장된 키드들의 집합 : " + hm.keySet()); //KeySet은 어레이 형태입
		for(String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		
		hm.remove("곱배기");
		
		hm.replace("삼합", 30);
		
		for(String key : hm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		
		hm.put("아이유", 500);
		
		System.out.println(String.format("몇의 크기 : %s", hm.size()));
		
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
		}
		
	}

}