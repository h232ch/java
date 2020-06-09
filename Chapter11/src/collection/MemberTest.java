package collection;

import java.util.ArrayList;

public class MemberTest {

	public static void main(String[] args) {
		
		ArrayList<Member> listMem = new ArrayList<Member>();
		Member m1 = new Member(1,"kim");
		
		listMem.add(m1);
		
		System.out.println(listMem.get(0));
		System.out.println(listMem);
		
		System.out.println(m1.hashCode());
		
	}
}
