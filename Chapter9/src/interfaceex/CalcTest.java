package interfaceex;

public class CalcTest {
	
	public static void main(String[] args) {
		//CompleteCalc calc = new CompleteCalc();
		//Calculator calc = new CompleteCalc();
		Calc calc = new CompleteCalc(); // Clac 인터페이스 타입의 calc를CompleteCalc의 인스턴스  참조변수로 생성
		int n1=10; int n2=2;
		
		calc.description(); //디폴트 메서드를 이용하는 예
		calc.test(calc);
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		//calc.showInfo(); 이것을 사용하고자 한다면 ComplateCalc 타입을 사용해야 함	
		
		calc.description(); //디폴트 메서드 구현, 실제로 interface에 존재하며, Calc 인스턴스 생성시 사용가능
		// 하지만 지금은 CompliteCalc 메서드에서 해당 메서드를 오버로딩(선택)해서 지금은 CompliteCalc의 메서드가 보임
		
		int[] arr= {1,2,3,4,5};
		int sum=Calc.total(arr); // 인터페이스 타입으로 가져다가 씀
		System.out.println(sum);
	}

}
