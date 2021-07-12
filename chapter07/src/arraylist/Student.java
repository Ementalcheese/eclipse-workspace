package arraylist;

import java.util.ArrayList;


public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //arraylist 선언하기 과목명,점수를 담는 객체형 배열
	
	public Student(int studentID, String studentName)
	{
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //arraylist 생성하기
	}
	
	
	public void addSubject(String name, int score){
		Subject subject = new Subject();     //Subject 생성하기
		subject.setName(name);               //과목이름 추가하기
		subject.setScorePint(score);         //점수 추가하기3
		subjectList.add(subject);            //배열에 저장하기
	}
	
	public void showStudentInfo()
	{
		int total = 0;
		for(Subject s: subjectList)
		{
			total += s.getScorePoint();
			System.out.println("학생" + studentName+"의"+s.getName()+" 과목 성적은 " + s.getScorePoint() + " 입니다.");
		}
		
		System.out.println("학생" + studentName + "의 총점은 "+total+" 입니다.");
	}
	
	

}
