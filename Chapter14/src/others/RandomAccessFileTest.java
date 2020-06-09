package others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하셍?");
		
		//int i = rf.readInt(); 오류발생 -> 현재는 안녕하셍? 자리에 와있음
		
		rf.seek(0);// 포지션을 처음으로 맞춰줌
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		rf.close();
		
		
	}

}
