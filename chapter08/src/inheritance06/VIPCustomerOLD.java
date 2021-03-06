package inheritance06;

public class VIPCustomerOLD {
	private int customerID; //고객 아이디
	private String customerName; // 고객이름
	private String customerGrade; //고객 등급 vip,gold.silver..
	int bonusPoint;  //포인트 적립 
	double bonusRatio; //포인트 적립,할인 비율
	
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
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint+ "입니다";
	}
	
	
}
