package chapter05;
import chapter05.Order;
public class Order_Test {

	public static void main(String[] args) {
		
		Order newOrder = new Order();
		
		newOrder.orderNum = 201803120001L;
		newOrder.orderID ="abc123";
		newOrder.orderDate ="2018�� 3�� 12��";
		newOrder.orderName ="ȫ���";
		newOrder.productNum ="PD0345-12";
		newOrder.adress ="����� �������� ���ǵ��� 20����";
		
		newOrder.Showinfo();
				
		
				

	}

}
