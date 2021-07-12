package chapter05;
import chapter05.Order;
public class Order_Test {

	public static void main(String[] args) {
		
		Order newOrder = new Order();
		
		newOrder.orderNum = 201803120001L;
		newOrder.orderID ="abc123";
		newOrder.orderDate ="2018년 3월 12일";
		newOrder.orderName ="홍길순";
		newOrder.productNum ="PD0345-12";
		newOrder.adress ="서울시 영등포구 여의도동 20번지";
		
		newOrder.Showinfo();
				
		
				

	}

}
