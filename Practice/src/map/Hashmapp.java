package map;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("����", 100);
		hm.put("�����", 200);
		
		System.out.println(hm.keySet());
		
		System.out.println("�ʿ� ����� Ű����� ���� : " + hm.keySet()); //KeySet�� ��� ������
		for(String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		
		hm.remove("�����");
		
		hm.replace("����", 30);
		
		for(String key : hm.keySet()) {
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		
		hm.put("������", 500);
		
		System.out.println(String.format("���� ũ�� : %s", hm.size()));
		
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, hm.get(key)));
		}
		
	}

}