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
			//String str = (String)list.get(i);  //어레이타입 미기재시 이렇게해줘야함  (String)
			String str = list.get(i);
			System.out.println(str);
		}

		for(Object s : list) { //오브젝는 모든 클래스의 최상위 클래스이다. 어레이타입 미기재시 이렇게해줘야함
			System.out.println(s);
		}
	}

}
