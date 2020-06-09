package generic2;

class Person3<T>{
	T info;
	Person3(T info){
		this.info = info;
	}
}

class Employee{
	
	int rank;
	Employee(int rank){
		this.rank = rank;
	}
}

class Student{
	
	int rank;
	Student(int rank){
		this.rank = rank;
	}
}

public class GenericDemo2 {
	public static void main(String[] args) {

		Person3<Employee> p1 = new Person3<Employee>(new Employee(1));
		Employee e1 = p1.info;
		
		System.out.println(e1.rank);
	}
}
