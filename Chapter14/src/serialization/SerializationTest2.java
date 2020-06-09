package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Externalizable{
	String name;
	String job;
	transient String job2; //����ȭ ���� ����� ������
	
	public Person1(String name, String job){
		this.name = name; this.job = job;
	}
	
	public String toString() {
		return name+","+job;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
	}
}

public class SerializationTest2 {

	public static void main(String[] args) {
		
		Person1 personLee = new Person1("Lee", "Engineer");
		Person1 personKim = new Person1("Kim", "Developer");
		
		try(FileOutputStream fos = new FileOutputStream("serial.dat"); // ����ȭ
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person1 p1 = (Person1)ois.readObject(); //������ȭ
			Person1 p2 = (Person1)ois.readObject();
			
			System.out.println(p1); System.out.println(p2);
			
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		// �ȵ���̵� ���α׷��ֿ���  ����ȭ�� ���� �ν��Ͻ��� �ְ�޴� ��찡 ����

	}

}
