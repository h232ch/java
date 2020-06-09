package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b)); //1~5까지 모두 더한값을 출력함
		
	}

}
