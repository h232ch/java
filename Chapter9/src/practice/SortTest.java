package practice;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		
		Sort sort;
		int[] num = {1,2,3,4,5};
		
		
		System.out.println("정렬 방식을 선택하세요! : ");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int sw = System.in.read();
		
		switch(sw) {
		
		case 'B':
			sort = new BubleSort();
			sort.ascedning(num);
			sort.descending(num);
			sort.description();
			break;
			
		case 'H':
			sort = new HeapSort();
			sort.ascedning(num);
			sort.descending(num);
			sort.description();
			break;
			
		case 'Q':
			sort = new QuickSort();
			sort.ascedning(num);
			sort.descending(num);
			sort.description();
			break;
		}
		
		
		
		
	}

}
