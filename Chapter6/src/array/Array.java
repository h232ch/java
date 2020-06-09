package array;

public class Array {
	
	public static void main(String[] args) {
		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alpahbets.length;i++) {
			alpahbets[i] = ch++;
		
		}
		
		for(int i=0; i<alpahbets.length;i++) {
			System.out.println(alpahbets[i]+"["+(int)alpahbets[i]+"]");
		}
		
		
		char[] test  = new char[1];
		test[0] = 65;
		System.out.println(test[0]);
	}

}
