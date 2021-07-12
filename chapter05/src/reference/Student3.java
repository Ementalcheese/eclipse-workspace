package reference;

public class Student3 {
	
	int studentID;        //학번
	String studentName;   //이름
	
	Subject korea; //참조형 자료형(Subject 클래스) 국어과목/점수
	Subject math;  //참조형 자료형(Subject 클래스) 수학과목/점수
	
	public Student3 ()
	{
		korea = new Subject();
		math = new Subject();
	}
	
	
	
	public void setKorea (String name, int score) {
		korea.subjectName = name;
		korea.scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
	

}
