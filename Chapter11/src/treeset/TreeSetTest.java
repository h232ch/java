package treeset;

public class TreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet manager = new MemberTreeSet();
		
		Member memberLee = new Member(300,"Lee");
		Member memberKee = new Member(200,"Kee");
		Member memberEee = new Member(400,"Eee");
		Member memberDee = new Member(400,"Dee"); //중복을 허용하지 않음
		
		manager.addMember(memberLee);
		manager.addMember(memberKee);
		manager.addMember(memberEee);
		manager.addMember(memberDee);
		
		manager.removeMember(220);
		System.out.println(manager.removeMember(200));
		
		manager.showAllMember();
		
	}

}
