package inheritance06;

public class Customer {
	
	protected int customerID; //고객 아이디
	protected String customerName; // 고객이름
	protected String customerGrade; //고객 등급 vip,gold.silver..
	int bonusPoint;  //포인트 적립 
	double bonusRatio; //포인트 적립,할인 비율
	
	public Customer()
	{
		customerGrade = "Silver";
		
		bonusRatio = 0.01;
		System.out.println("customer() 생성자");
	}
	
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo()
	{
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint+ "입니다";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	

}
