package staticex;

public class Student2 {
	
	
	private static int serialNum = 1000;   //외부에서의 직접 참조가 불가하도록 private로 변경
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i= 10;
		return serialNum;
		//studentName = "이지원"; //static 메서드에서는 멤버변수(인스턴스변수)를 사용할수없음.
	}
	
	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
