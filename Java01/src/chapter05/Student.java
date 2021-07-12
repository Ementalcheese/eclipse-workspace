package chapter05;

public class Student {
	
	int studentID;         //멤
	String studentName;    //버
	int grade;             //변
	String address;        //수   (속성)
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // 이름,주소 출력하는 메소드ㅗ
	}
	public String getStudentName() {                            //메
		return studentName;                                     //소
	}
	public void setStudentName(String name)	{                   //드    (기능)
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		
		
	}

}
