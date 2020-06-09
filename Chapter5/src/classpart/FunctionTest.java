package classpart;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int  calcSum() {
		int sum = 0; int i;
		for(i=0;i<=100;i++) {
			sum+=1;
		}
		return sum;
	}
	
}
