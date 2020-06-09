package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		try {
			for(int i=0;i<=5;i++) { // 4까지 존재하는 어레이에 5를 요청함 -> 오류발생
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getStackTrace());
			System.out.println(e.toString());
			System.out.println("예외처리");
		} 
		System.out.println("프로그램 종료");
		
		
	}

}
