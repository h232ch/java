package decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos); //자료가 저장된 상태 그대로 자료형을 유지하여 일거나 쓰는 기능 제공
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			dos.writeByte(100); //자료형을 유지하며 써준다.
			dos.write(100); //자료형을 유지하며 써준다.
			dos.writeChar('A'); //자료형을 유지하며 써준다.
			dos.writeUTF("TEST 안녕하셈요~"); //자료형을 유지하며 써준다.
			
			System.out.println(dis.readByte()); //자료형 유지하며 꺼내준다.
			System.out.println(dis.read()); //자료형 유지하며 꺼내준다.
			System.out.println(dis.readChar()); //자료형 유지하며 꺼내준다.
			System.out.println(dis.readUTF()); //자료형 유지하며 꺼내준다.
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}
