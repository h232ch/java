package Chapter3;

import java.util.Scanner;

public class OperatorEx8 {
	
	public static void main(String[] args) {
		
System.out.println("Ȧ�� ���� �Է��ϼ���:");
		
		Scanner scanner = new Scanner(System.in);
		int lineCount = scanner.nextInt();  //�ٸ� Ȧ�� ���� �־����
		int spaceCount;
		spaceCount = lineCount/2 +1;

		int starCount = 1;
		
		for (int i=1; i<=lineCount; i++) {
			for(int j=1; j<=spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=starCount; j++) {
				System.out.print('*');
			}
			for(int j=i; j<=spaceCount; j++) {
				System.out.print(' ');
			}
			
			if(i<=lineCount/2) {
				spaceCount-=1;
				starCount+=2;
			}else {
				spaceCount+=1;
				starCount-=2;
			}
			
			System.out.println("");
		}
	}
}
