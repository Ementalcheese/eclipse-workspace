package hiding;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 1234;
		//studentLee.studentName = "�̻���"; .
		
		
		studentLee.setStudentName("�̻���");
		
		System.out.println(studentLee.getStudentName());
	}

}