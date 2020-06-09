package variable;

public class ExplictTest {
	
	public static void main(String[] args) {
		
		int i = 1000;
		//byte bNum =i; 큰형이 작은형으로 들어가면 오류 발생 명시적 변환 필요
		
		byte bNum = (byte)i; // 명시적 형변환, 이때 숫자가 유실될수있음 _ 바이트는 -2^7 ~ 2^7-1 까지 표현
		// 숫자가 잘리면서 유실이 발생됨
		
		System.out.println(bNum);
		
		double dNum1 =1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum; // Int형으로 변환후 덧셈
		int iNum2 = (int)(dNum1 + fNum); // 덧셈후 Int형으로 변환
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
	}

}
