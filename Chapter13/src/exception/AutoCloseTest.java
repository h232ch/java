package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObject obj = new AutoCloseObject()){
			
			throw new Exception(); // 강제로 익셉션 발생
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		// 클로스가 호출되는 것을 확인 가능하다.

	}

}
