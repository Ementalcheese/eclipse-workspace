package chapter04;

public class Switch_If_Convert {

	public static void main(String[] args) {
		
		String medal = "c";
		
		if (medal == "Gold" || medal == "G" || medal == "g") {
			
			System.out.println("�ݸ޴� �Դϴ�.");

		} else if (medal == "Silver" || medal == "S" || medal == "s") {
			
			System.out.println("���޴� �Դϴ�.");

		} else if (medal == "Bronze" || medal == "B" || medal == "b") {
			
			System.out.println("���޴� �Դϴ�.");
			
		} else {
			
			System.out.println("�޴��� �����ϴ�.");
		}
		
	}

}
