package array;

public class ObjectCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥","김세환");
		library[1] = new Book("태백산","김또깡");
		library[2] = new Book("태백","김세발");
		library[3] = new Book("태","김세수");
		library[4] = new Book("태평양","김세지");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		//향상된 포문 라이브러리의 전체값을 돌겠다는 조건이라면
		/*for(Book book : copyLibrary) { //copyLibrary의 전체 변수를 뽑아서 Book 형으로 만들어진 book 변수 넣겠다 이 기능은 클래스 변수에서만 사용 가능
			book.showBookInfo();
		}*/
		
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("============");
		
		for(Book book : copyLibrary) { // System.arraycopy 함수는 주소값을 복사하는 방식으로 원본 데이터 변경시 복사 값도 변경됨 이것을 얉은 복사라고 함
			book.showBookInfo();
		}
		
		// 반대로 깊은 복사의 경우 System.arraycopy가 아닌 일일이 값을 대입해야 하는 방식으로 해야 함
		
		copyLibrary[0] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i=0;i<library.length;i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("나");
		library[0].setAuthor("박");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		System.out.println("============");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		} //깊은 복사와 얇은 복사의 차이점 기억해둬야함
	}
	
}
