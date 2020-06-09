package treeset;

import java.util.TreeSet;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		
		
		
		treeSet.add("kim");
		treeSet.add("lim");
		treeSet.add("eim");
		treeSet.add("oim");
		
		for(String str : treeSet) {
			System.out.println(str); //정렬이되어서 나옴
		}
	}
	

}
