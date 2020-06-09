package collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(collection.hashMap.Member member) {
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}else {
			System.out.println("There is no memberId");
			return false;
		}
	}
	
	public void showAllmember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); //�ߺ��� ���� Ű ��ü�� set Ÿ������ ��ȯ
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}
