package inheritance06;

public class VipCustomer extends Customer {

	
	
	private int agentID;
	double saleRatio;
	
	public VipCustomer()
	{
		customerGrade = "VIP";
		saleRatio = 0.1;
		bonusRatio = 0.05;
		System.out.println("vip ������");
	}
	
	
	public int getAgentID()
	{
		return agentID;
	}
	
	
	
	
}
