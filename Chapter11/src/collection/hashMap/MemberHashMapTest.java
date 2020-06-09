package collection.hashMap;

import treeset.Member;
import treeset.MemberTreeSet;

public class MemberHashMapTest {
	
	public static void main(String[] args) {
		MemberHashMap manager = new MemberHashMap();
		
		collection.hashMap.Member memberLee = new collection.hashMap.Member(300,"Lee");
		collection.hashMap.Member memberKee = new collection.hashMap.Member(300,"Kee"); // 증복을 허용하지 않음
		collection.hashMap.Member memberEee = new collection.hashMap.Member(200,"Eee"); // 증복을 허용하지 않음
		
		manager.addMember(memberLee);
		manager.addMember(memberKee);
		manager.addMember(memberEee);
		
		
		
		manager.showAllmember();
		
		//manager.addMember(memberLee);
		
		//manager.showAllmember();
		
		// Map 인터페이스는 다시해봐야함
	}

}
