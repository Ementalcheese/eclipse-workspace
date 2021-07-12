package car;

public abstract class Car {
	
	abstract public void start();
	abstract public void drive();
	abstract public void stop();
	abstract public void turnoff();
	
	final public void run()
	{
		start();
		drive();
		stop();
		turnoff();
	}
	
	public void washCar()
	{
		System.out.println("세차를 합니다");
	}

}
