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
				DataOutputStream dos = new DataOutputStream(fos); //�ڷᰡ ����� ���� �״�� �ڷ����� �����Ͽ� �ϰų� ���� ��� ����
				FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			
			dos.writeByte(100); //�ڷ����� �����ϸ� ���ش�.
			dos.write(100); //�ڷ����� �����ϸ� ���ش�.
			dos.writeChar('A'); //�ڷ����� �����ϸ� ���ش�.
			dos.writeUTF("TEST �ȳ��ϼ���~"); //�ڷ����� �����ϸ� ���ش�.
			
			System.out.println(dis.readByte()); //�ڷ��� �����ϸ� �����ش�.
			System.out.println(dis.read()); //�ڷ��� �����ϸ� �����ش�.
			System.out.println(dis.readChar()); //�ڷ��� �����ϸ� �����ش�.
			System.out.println(dis.readUTF()); //�ڷ��� �����ϸ� �����ش�.
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		
	}
}
