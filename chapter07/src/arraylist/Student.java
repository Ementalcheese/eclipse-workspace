package arraylist;

import java.util.ArrayList;


public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //arraylist �����ϱ� �����,������ ��� ��ü�� �迭
	
	public Student(int studentID, String studentName)
	{
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); //arraylist �����ϱ�
	}
	
	
	public void addSubject(String name, int score){
		Subject subject = new Subject();     //Subject �����ϱ�
		subject.setName(name);               //�����̸� �߰��ϱ�
		subject.setScorePint(score);         //���� �߰��ϱ�3
		subjectList.add(subject);            //�迭�� �����ϱ�
	}
	
	public void showStudentInfo()
	{
		int total = 0;
		for(Subject s: subjectList)
		{
			total += s.getScorePoint();
			System.out.println("�л�" + studentName+"��"+s.getName()+" ���� ������ " + s.getScorePoint() + " �Դϴ�.");
		}
		
		System.out.println("�л�" + studentName + "�� ������ "+total+" �Դϴ�.");
	}
	
	

}
