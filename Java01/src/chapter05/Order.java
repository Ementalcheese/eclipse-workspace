package chapter05;

public class Order {
	long orderNum;
	String orderID;
	String orderDate;
	String orderName;
	String productNum;
	String adress;
	
	public void Showinfo()
	{
		System.out.println("주문번호: " + orderNum);
		System.out.println("주문자 아이디: " + orderID);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자이름: " + orderName);
		System.out.println("주문상품번호: " + productNum);
		System.out.println("배송 주소: " + adress);
	}
	
}
