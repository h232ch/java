package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		long milliseconds = 0;
		try(FileInputStream fis = new FileInputStream("a.txt");
				FileOutputStream fos = new FileOutputStream("copy.txt");
				BufferedInputStream bis = new BufferedInputStream(fis); // �ξ� ���� ����ӵ� ���ۻ��̵� 8k
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			milliseconds = System.currentTimeMillis();
			
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		isr.readLine(); // ä���ϰ� ����ġ�� �� ���ٸ� �о��
		// socket�� ����Ʈ������ ��ǲ��Ʈ���� �ް� inputStreamReader�� 2����Ʈ�� �������ֵ����ϰ� bufferedreader�� �ӵ��� �÷���
		
		
		System.out.println("�ð� : "+milliseconds);
	}

}
