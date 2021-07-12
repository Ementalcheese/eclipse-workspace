package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		
		Car mySonata = factory.createCar();
		System.out.println(factory.getSerialNum());
		
		Car yourSonata = factory.createCar();
		System.out.println(factory.getSerialNum());
		
		
		System.out.println(mySonata.getCarNum());		
		System.out.println(yourSonata.getCarNum());
		
		
		System.out.println(mySonata);
		System.out.println(yourSonata);
		
		
		
		
		
		
	}

}
