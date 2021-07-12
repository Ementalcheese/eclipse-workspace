package witharraylist;

public class VipCustomer extends Customer {

	
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer(int customerID, String customerName, int agentID)
	{
		super(customerID,customerName);
		customerGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
		this.agentID = agentID;
		System.out.println("vip ������");
	}
	
	
	public int getAgentID()
	{
		return agentID;
	}
	
	@Override
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
	public String showCustomerInfo()
	{
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + " �Դϴ�.";
	}
	
}