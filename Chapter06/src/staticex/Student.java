package staticex;

public class Student {

	
	public static int serialNum = 1000; //클래스변수 (데이타영역에 생성) static 변수는 인스턴스 생성과 상관 없이 먼저 생성됨!
	                                   // (모든 인스턴스에서 접근가능)
	                                    //프로그램이 종료될 때 제거
	                                // ----------------------------
	public int studentID;            //멤버변수(인스턴스변수) < - - 힙영역에 생성
	public String studentName;      //new 키워드를 통해서 인스턴스 생성시에 힙영역에 생성.
	public int grade;              //가비지 컬렉터에 의해서 제거
	public String address;        //그 인스턴스 내에서만 사용

	/*
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	{
		studentName = name;
	}
	*/
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public static int getSerialNum()
	{
		int i = 10;
		return serialNum;
	}
	

	public static void setSerialNum(int serialNum)
	{
		Student.serialNum = serialNum;
	}
}
