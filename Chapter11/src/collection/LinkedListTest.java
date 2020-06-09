package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		ArrayList<String> myArray = new ArrayList<String>();
		
		myArray.add("AAAA");
		System.out.println(myArray.get(0)); // LinkeList와 ArrayList의 호출 명령등은 동일함 단지 용도에 따라 쓰면됨
		
		// LinkedList와 ArrayList 사용용도 검색해보기
		
		myList.add("A");
		myList.add("b");
		myList.add("c");
		System.out.println(myList);
		
		myList.add(1,"D");
		System.out.println(myList);
		
		System.out.println(System.identityHashCode(myList.get(0)));
		System.out.println(System.identityHashCode(myList.get(1)));
		System.out.println(System.identityHashCode(myList.get(2)));
		
		myList.removeLast();
		System.out.println(myList);
		
		for(int i=0;i<myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
	}
}
