package reference;

public class Student3 {
	
	int studentID;        //�й�
	String studentName;   //�̸�
	
	Subject korea; //������ �ڷ���(Subject Ŭ����) �������/����
	Subject math;  //������ �ڷ���(Subject Ŭ����) ���а���/����
	
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
