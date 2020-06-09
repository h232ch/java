package generic2;



class Employee4{
	public int rank;
	public Employee4(int rank) {
		this.rank=rank;
	}
}


class Person6<T>{
	
	T info;
	
	Person6(T info){
		this.info = info;
	}
	
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
	
}


public class GenericDemo3 {

	public static void main(String[] args) {
		
		Employee4 e1 = new Employee4(1);
		
		Person6<Employee4> p1 = new Person6<Employee4>(e1);
		Person6<Employee4> p2 = new Person6<Employee4>(new Employee4(1));
		
		p1.<Integer>printInfo(e1.rank);
		// p2.<Integer>printInfo(p2.rank); 에러발생
		
	}

}
