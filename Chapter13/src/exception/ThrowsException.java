package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	
	public Class loadCladd(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); //메서드에서 예외 처리를 미루고 호출하는 곳에서 처리하게 함
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
	
		ThrowsException test = new ThrowsException();
		try {
			test.loadCladd("a.txt", "java.lang.string");
			//test.loadCladd("b.txt", "java.lang.string");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (Exception e) { //최상위 익셉션을 마지막에 검, 최상위 오류이기떄문에 오류발생시 필시 걸림
			System.out.println(e);
		}
	}

}
