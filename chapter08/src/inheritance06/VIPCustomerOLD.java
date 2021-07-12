package inheritance06;

public class VIPCustomerOLD {
	private int customerID; //���� ���̵�
	private String customerName; // �����̸�
	private String customerGrade; //���� ��� vip,gold.silver..
	int bonusPoint;  //����Ʈ ���� 
	double bonusRatio; //����Ʈ ����,���� ����
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOLD()
	{
		customerGrade = "VIP";
		
		saleRatio = 0.1;
		
		bonusRatio = 0.5;
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID()
	{
		return agentID;
	}
	
	public String showCustomerInfo()
	{
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint+ "�Դϴ�";
	}
	
	
}