package witharraylist;

public class CustomerTest1 {

	public static void main(String[] args) {
		
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerKim = new VipCustomer(10020,"김유신",10000);
		System.out.println(customerKim.showCustomerInfo());
		
		
	}

}
