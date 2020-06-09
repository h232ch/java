package map;

import java.util.Iterator;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(40, "사십");
		tm.put(50, "오십");
		
		System.out.println("맴에 저장된 키들의 집합 "+tm.keySet());
		
		for(Integer key : tm.keySet()) {
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		
		tm.remove(40);
		
		tm.replace(50, "오십오십");
		
		Iterator<Integer> keys = tm.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}
		
		System.out.println("Size of TM : "+tm.size());
		
		tm.clear();
	}
}
