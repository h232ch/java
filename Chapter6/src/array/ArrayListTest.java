package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		//ArrayList list = new ArrayList();
		
		list.add("aa");
		list.add("ab");
		list.add("ac");
		
		for(int i=0;i<list.size();i++) {
			//String str = (String)list.get(i);  //���Ÿ�� �̱���� �̷����������  (String)
			String str = list.get(i);
			System.out.println(str);
		}

		for(Object s : list) { //�������� ��� Ŭ������ �ֻ��� Ŭ�����̴�. ���Ÿ�� �̱���� �̷����������
			System.out.println(s);
		}
	}

}
