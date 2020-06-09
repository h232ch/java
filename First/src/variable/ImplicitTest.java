package variable;

public class ImplicitTest {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum; // 작은형 -> 큰형 묵시적 형변환
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		
		System.out.println(dNum); //iNum은 Float로 변경되고 fNum과 더한값이 Double로 변경됨
		

	}

}
