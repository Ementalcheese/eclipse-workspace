package staticex;

public class Student {

	
	public static int serialNum = 1000; //Ŭ�������� (����Ÿ������ ����) static ������ �ν��Ͻ� ������ ��� ���� ���� ������!
	                                   // (��� �ν��Ͻ����� ���ٰ���)
	                                    //���α׷��� ����� �� ����
	                                // ----------------------------
	public int studentID;            //�������(�ν��Ͻ�����) < - - �������� ����
	public String studentName;      //new Ű���带 ���ؼ� �ν��Ͻ� �����ÿ� �������� ����.
	public int grade;              //������ �÷��Ϳ� ���ؼ� ����
	public String address;        //�� �ν��Ͻ� �������� ���

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
