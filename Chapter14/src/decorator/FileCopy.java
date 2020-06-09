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
				BufferedInputStream bis = new BufferedInputStream(fis); // 훨씬 빠름 복사속도 버퍼사이드 8k
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
		isr.readLine(); // 채팅하고 엔터치면 그 한줄만 읽어옮
		// socket은 바이트단위로 인풋스트림을 받고 inputStreamReader로 2바이트씩 읽을수있도록하고 bufferedreader로 속도를 올려줌
		
		
		System.out.println("시간 : "+milliseconds);
	}

}
