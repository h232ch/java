package generic2;

class Person<T, Y>{
	public T info;
	
	public Y info2;
	
	Person(T info){
		this.info = info;
	}
	
	Person(T info,Y info2){
		this.info = info;
		this.info2 = info2;
	}
	
}

class Person2<E>{
	public E info;
	
	Person2(E info){
		this.info = info;
	}
}

public class GenericDemo {
	
	public static void main(String[] args) {
		
		Person<String, Integer> p1 = new Person<String,Integer>("부장",1);
		Person<String, String> p2 = new Person<String, String>("사원");
		
		Person2<Integer> p3 = new Person2<Integer>(1);
		System.out.println(p3.info);
		System.out.println(p1.info);
		
		
	}
}
