package Chapter3;
public class OperatorEx3 {
	
	public static void main(String[] args) {
		
		int num1 =10;
		
		int i = 2;
				
		boolean value = (1==1);
		boolean value2 = ((num1 = num1 +10)<10) || ((i = i+2)<10);
		boolean value3 = ((num1 = num1 +10)<10) && ((i = i+2)<10);
		
		
		int num2 = 10;
		int num3 = 20;
		int num = (num2>num3)?num2:num3;
		boolean num4 = (10>20)?true:false;
		
		
		System.out.println(num4);
	}
}