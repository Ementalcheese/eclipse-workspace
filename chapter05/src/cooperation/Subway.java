package cooperation;

public class Subway {
	
	String lineNumber;      //����ö �뼱
	int passengerCount;     //�°� ��
	int money;              //���� ��
	
	public Subway(String lineNumber)
	{
		this.lineNumber = lineNumber;
	}

	
	public void take(int money)  //�°��� ����ö�� ź ��츦 ������ �޼���
	{
		this.money += money;     //���� ����
		passengerCount ++;       //�°� �� ����
	}
	
	public void showInfo()   //����ö ������ ����ϴ� �޼���.
	{
		System.out.println(lineNumber + "�� �°���" + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
		
		
	}
	
}

