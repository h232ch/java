package collection.hashMap;

import treeset.Member;
import treeset.MemberTreeSet;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		MemberHashMap manager = new MemberHashMap();
		
		collection.hashMap.Member memberLee = new collection.hashMap.Member(300,"Lee");
		collection.hashMap.Member memberKee = new collection.hashMap.Member(300,"Kee"); // ������ ������� ����
		collection.hashMap.Member memberEee = new collection.hashMap.Member(200,"Eee"); // ������ ������� ����
		
		manager.addMember(memberLee);
		manager.addMember(memberKee);
		manager.addMember(memberEee);
		
		
		
		manager.showAllmember();
		
		//manager.addMember(memberLee);
		
		//manager.showAllmember();
		
		// Map �������̽��� �ٽ��غ�����
	}

}
