package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
	
	public Class loadCladd(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); //메서드에서 예외 처리를 미루고 호출하는 곳에서 처리하게 함
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
	
		ThrowsException2 test = new ThrowsException2();
		try {
			test.loadCladd("a.txt", "java.lang.string");
		} catch (FileNotFoundException | ClassNotFoundException e) { //두종류의 예외를 동시에 처리
			System.out.println(e);
		}
	}
	

}
