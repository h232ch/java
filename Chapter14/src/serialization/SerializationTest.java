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
	transient String job2; //����ȭ ���� ����� ������
	
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
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat"); // ����ȭ
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person)ois.readObject(); //������ȭ
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1); System.out.println(p2);
			
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		// �ȵ���̵� ���α׷��ֿ���  ����ȭ�� ���� �ν��Ͻ��� �ְ�޴� ��찡 ����

	}

}
