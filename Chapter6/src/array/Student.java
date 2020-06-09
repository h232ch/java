package array;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	
	ArrayList<Subject> subjectList; //아주 중요한 부분 클래스내 배열 사용시 꼭 사용해보기 -> 다차원도 써보기
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		subjectList.add(subject);
		
	}
	
	public void showStudentInfo() {
		int total = 0;
		int subjectSize = subjectList.size();
		for(Subject subject : subjectList) {
			total +=subject.getScore();	
			System.out.println(studentName+" 학생의 "+subject.getName()+" 과목의 성적은 "+subject.getScore()+"입니다.");
			
		}
		System.out.println(studentName+" 학생의  평균은"+(total/subjectSize)+" 입니다.");
		System.out.println("");
	}
	
	
	
}
