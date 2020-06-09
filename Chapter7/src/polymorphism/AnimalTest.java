package polymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 날아 다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 폅니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal pAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		
		test.moveAnimal(hAnimal); //1차 폴리모피즘
		test.moveAnimal(pAnimal);
		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(pAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal :animalList) { //2차 폴리모피즘
			animal.move();
			//test.moveAnimal(animal);
		}
		
		//hAnimal.readBook(); 호출 불가 이유 : hAnimal의 형이 Animal 형이기 때문 -> 다운캐스팅 필요
		Human human = (Human)hAnimal;
		human.readBook();
		
		//다운캐스팅시 주의할점
		//Eagle human1 = (Eagle)hAnimal; //오류발생 휴먼 인스턴스가 이글 인스턴스로 다운캐스팅 될수없다
		
		if(hAnimal instanceof Human) { // 이런식으로 예방책을 만들어놓음
			Human human1 = (Human)hAnimal;
			human1.readBook();
		}
		
		//중요 반환타입이 하위클래스 타입이라면 상위 -> 하위 다운캐스팅 필요
		// Customer vc = new VIPCustomer (); 묵시적 형변환
		// VIPCustomer vCustomer = (VIPCustomer)vc; 명시적 형변환
		
		AnimalTest test1 = new AnimalTest();
		test1.testDownCasting(animalList); //다운캐스팅 모두뽑아내기
		//다운캐스팅은 웬만하면 오버라이딩+폴리모피즘 구성으로 해결하는게 좋음 그러나
		//다운캐스팅은 프로그램의 안정성을 떨어뜨림
		
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
