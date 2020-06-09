
package treeset;
import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2)*(-1); //this-�񱳴�� = ���(��������), ����(��������)
	} 
	
}

public class ComparatorTest {
public static void main(String[] args) {
		
	
		Integer i = new Integer(10);
		System.out.println(i.compareTo(10));
		
		
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare()); //new �ϴ����� MyCompare�� �������̵��ϱ�����
		treeSet.add("kim");
		treeSet.add("kang");
		treeSet.add("Lee");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
