package hiding;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		studentLee.studentID = 1234;
		//studentLee.studentName = "이상해"; .
		
		
		studentLee.setStudentName("이상해");
		
		System.out.println(studentLee.getStudentName());
	}

}
