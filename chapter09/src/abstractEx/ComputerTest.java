package abstractEx;

public class ComputerTest {
	

	public static void main(String[] args) {
		
	//	Computer c1 = new Computer();   // 추상 클래스는 객체 생성 불가.
		Computer c2 = new DeskTop();
	//	Computer c3 = new NoteBook();   // 추상 클래스는 객체 생성 불가.
		Computer c4 = new MyNoteBook();
		
	}

}
