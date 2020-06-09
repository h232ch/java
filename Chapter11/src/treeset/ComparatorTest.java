
package treeset;
import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)*(-1); //this-비교대상 = 양수(오름차순), 음수(내림차순)
	} 
	
}

public class ComparatorTest {
public static void main(String[] args) {
		
	
		Integer i = new Integer(10);
		System.out.println(i.compareTo(10));
		
		
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); //new 하는이유 MyCompare의 오버라이딩하기위해
		treeSet.add("kim");
		treeSet.add("kang");
		treeSet.add("Lee");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
