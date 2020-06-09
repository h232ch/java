package plactice2;

public class TravelCustomer {
	
	private String name;
	private int age;
	private int price;
	
	public TravelCustomer(String name, int age, int price){
		this.name=name;
		this.age=age;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() { // 이함수가 없으면 메모리값을 반환함
		return name+","+age+","+price;
	}
	
	

}
