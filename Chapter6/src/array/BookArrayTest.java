package array;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5]; // Book�� ������·� �ν��Ͻ�ȭ!
		
		
		library[0] = new Book("�¹���","�輼ȯ");
		library[1] = new Book("�¹��","��Ǳ�");
		library[2] = new Book("�¹�","�輼��");
		library[3] = new Book("��","�輼��");
		library[4] = new Book("�����","�輼��");
		
		for(int i = 0; i<library.length; i++) {
			System.out.println(library[i]); //�� ���� �ּҰ��� �� ���� �� �迭�� �ϳ��� �ν��Ͻ��� Ŭ���� ������
			library[i].showBookInfo(); 		//�ش� �迭 �ν��Ͻ��� �޼��带 �̿��Ͽ� �� ȣ��
		}
		
		

	}

}
