package cooperation;

public class Student {
	
	public String studentName;   //�л��̸�
	public int grade;            //�г�
	public int money;            //�л��� ������ �ִ� ��
	
	public Student(String studentName, int money)
	{
		this.studentName = studentName;    //�л� �̸��� ���� ���� �Ű������� �޴� ������
		this.money = money;
	}
	
	public void takeBus(Bus bus)
 	{
		bus.take(1000);            //�л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) // �л��� ����ö�� Ÿ�� 1500���� �����ϴ� ����� ������ �޼���
	{
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo()         //�л��� ���� ������ ����ϴ� �޼���
	{
		System.out.println(studentName + "���� ���� ���� " + money + "�Դϴ�.");
	}

}
