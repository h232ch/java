package set;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<String>();
		set.add("Lee");
		set.add("kim");
		set.add("oh");
		set.add("oh"); // �ߺ��� ������� ����
		System.out.println(set); //������ �ȵ� ���·� ��簪�� ��
		// id, �ֹι�ȣ, �й�, ������� ������ �� �̾��̸� �����
		
		Iterator<String> ir = set.iterator(); // ������� ����Ϸ��� �̰��� ����� �÷��� ���� ��� ��밡��
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str); // ������� �����
		}
		
	}

}
