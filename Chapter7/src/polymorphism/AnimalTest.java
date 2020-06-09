package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� ���� �ٴմϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��ϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal pAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hAnimal); //1�� ����������
		test.moveAnimal(pAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(pAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal :animalList) { //2�� ����������
			animal.move();
			//test.moveAnimal(animal);
		}
		
		//hAnimal.readBook(); ȣ�� �Ұ� ���� : hAnimal�� ���� Animal ���̱� ���� -> �ٿ�ĳ���� �ʿ�
		Human human = (Human)hAnimal;
		human.readBook();
		
		//�ٿ�ĳ���ý� ��������
		//Eagle human1 = (Eagle)hAnimal; //�����߻� �޸� �ν��Ͻ��� �̱� �ν��Ͻ��� �ٿ�ĳ���� �ɼ�����
		
		if(hAnimal instanceof Human) { // �̷������� ����å�� ��������
			Human human1 = (Human)hAnimal;
			human1.readBook();
		}
		
		//�߿� ��ȯŸ���� ����Ŭ���� Ÿ���̶�� ���� -> ���� �ٿ�ĳ���� �ʿ�
		// Customer vc = new VIPCustomer (); ������ ����ȯ
		// VIPCustomer vCustomer = (VIPCustomer)vc; ����� ����ȯ
		
		AnimalTest test1 = new AnimalTest();
		test1.testDownCasting(animalList); //�ٿ�ĳ���� ��λ̾Ƴ���
		//�ٿ�ĳ������ �����ϸ� �������̵�+���������� �������� �ذ��ϴ°� ���� �׷���
		//�ٿ�ĳ������ ���α׷��� �������� ����߸�
		
	}
	public void moveAnimal(Animal a) {
		a.move();
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0;i<list.size();i++) {
			Animal animal = list.get(i);
			if(animal instanceof Human) {
				Human human3 = (Human)animal;
				human3.readBook();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}else if(animal instanceof Tiger){
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else {
				System.out.println("error");
			}
		}
	}
}
