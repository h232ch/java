package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name;
	String job;
	transient String job2; //직렬화 하지 말라는 접근자
	
	public Person(String name, String job){
		this.name = name; this.job = job;
	}
	
	public String toString() {
		return name+","+job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("Lee", "Engineer");
		Person personKim = new Person("Kim", "Developer");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat"); // 직렬화
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject(); //역질렬화
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1); System.out.println(p2);
			
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		// 안드로이드 프로그래밍에서  직렬화를 통해 인스턴스를 주고받는 경우가 있음

	}

}
