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
		System.out.println("�ֹ���ȣ: " + orderNum);
		System.out.println("�ֹ��� ���̵�: " + orderID);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ����̸�: " + orderName);
		System.out.println("�ֹ���ǰ��ȣ: " + productNum);
		System.out.println("��� �ּ�: " + adress);
	}
	
}
