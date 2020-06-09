package array;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] add = new int[10]; // int[]는 클래스 변수이고 4byte*10만큼의 메모리 공간을 생성한 후 그 주소를 참조변수 add에 전달함
		System.out.println(add); // 참조변수의 인스턴스 메모리 주소값 (인스턴스는 힙메모리에 존재함)
		int[] abb = new int[] {1,2,3}; // 선언과 동시에 초기화
		
		int[] arr = new int[10];
		int total = 0;
		double mtotal = 1;
		
		for(int i=0, num=1; i<arr.length; i++, num++) { //1~10까지 배열내 삽입하고자 한다면 for문에 조건을 추가함
			arr[i] = num;
			System.out.println(arr[i]); //초기값이 없을 경우 0이 존재함
		}
		
		for(int i=0; i<arr.length; i++) { //num으로 삽입한 1~10까지의 수를 더한 값을 Total에 넣어줌
			total += arr[i];
		}
		System.out.println(total);
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 1.1; count++; 
		dArr[2] = 1.1; count++; 
		dArr[3] = 1.1;
		
		for(int i=0;i<count;i++) {
			System.out.println(dArr[i]);
			mtotal *= dArr[i];
		}
		System.out.println(mtotal); 
		// 배열의 크기는 5이고, 유효한 값은 3개일경우 나머지 2개의 값은 0이된다. 이때 토탈값은 당연 0이된다.
		// 이때 카운트 변수를 사용하여 컨트롤 해주면 된다.
		
		int[] a = new int[10]; 
		// 기본형의 경우 이렇게 사용
		
		for(int b : a) {
			System.out.println(b);
		}
		
		
	}

}
