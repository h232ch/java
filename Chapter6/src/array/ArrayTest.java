package array;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] add = new int[10]; // int[]�� Ŭ���� �����̰� 4byte*10��ŭ�� �޸� ������ ������ �� �� �ּҸ� �������� add�� ������
		System.out.println(add); // ���������� �ν��Ͻ� �޸� �ּҰ� (�ν��Ͻ��� ���޸𸮿� ������)
		int[] abb = new int[] {1,2,3}; // ����� ���ÿ� �ʱ�ȭ
		
		int[] arr = new int[10];
		int total = 0;
		double mtotal = 1;
		
		for(int i=0, num=1; i<arr.length; i++, num++) { //1~10���� �迭�� �����ϰ��� �Ѵٸ� for���� ������ �߰���
			arr[i] = num;
			System.out.println(arr[i]); //�ʱⰪ�� ���� ��� 0�� ������
		}
		
		for(int i=0; i<arr.length; i++) { //num���� ������ 1~10������ ���� ���� ���� Total�� �־���
			total += arr[i];
		}
		System.out.println(total);
		
		double[] dArr = new double[5];
		int count = 0;
		dArr[0] = 1.1; count++;
		dArr[1] = 1.1; count++; 
		dArr[2] = 1.1; count++; 
		dArr[3] = 1.1;
		
		for(int i=0;i<count;i++) {
			System.out.println(dArr[i]);
			mtotal *= dArr[i];
		}
		System.out.println(mtotal); 
		// �迭�� ũ��� 5�̰�, ��ȿ�� ���� 3���ϰ�� ������ 2���� ���� 0�̵ȴ�. �̶� ��Ż���� �翬 0�̵ȴ�.
		// �̶� ī��Ʈ ������ ����Ͽ� ��Ʈ�� ���ָ� �ȴ�.
		
		int[] a = new int[10]; 
		// �⺻���� ��� �̷��� ���
		
		for(int b : a) {
			System.out.println(b);
		}
		
		
	}

}
