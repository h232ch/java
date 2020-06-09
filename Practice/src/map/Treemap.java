package map;

import java.util.Iterator;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(40, "���");
		tm.put(50, "����");
		
		System.out.println("�ɿ� ����� Ű���� ���� "+tm.keySet());
		
		for(Integer key : tm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
		}
		
		tm.remove(40);
		
		tm.replace(50, "���ʿ���");
		
		Iterator<Integer> keys = tm.keySet().iterator();
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, tm.get(key)));
		}
		
		System.out.println("Size of TM : "+tm.size());
		
		tm.clear();
	}
}
