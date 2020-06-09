package array;

public class ObjectCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���","�輼ȯ");
		library[1] = new Book("�¹��","��Ǳ�");
		library[2] = new Book("�¹�","�輼��");
		library[3] = new Book("��","�輼��");
		library[4] = new Book("�����","�輼��");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		//���� ���� ���̺귯���� ��ü���� ���ڴٴ� �����̶��
		/*for(Book book : copyLibrary) { //copyLibrary�� ��ü ������ �̾Ƽ� Book ������ ������� book ���� �ְڴ� �� ����� Ŭ���� ���������� ��� ����
			book.showBookInfo();
		}*/
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("============");
		
		for(Book book : copyLibrary) { // System.arraycopy �Լ��� �ּҰ��� �����ϴ� ������� ���� ������ ����� ���� ���� ����� �̰��� ���� ������ ��
			book.showBookInfo();
		}
		
		// �ݴ�� ���� ������ ��� System.arraycopy�� �ƴ� ������ ���� �����ؾ� �ϴ� ������� �ؾ� ��
		
		copyLibrary[0] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0;i<library.length;i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("��");
		library[0].setAuthor("��");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("============");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		} //���� ����� ���� ������ ������ ����ص־���
	}
	
}
