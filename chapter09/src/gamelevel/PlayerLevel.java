package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count)      // 템플릿 메서드 작업의 순서를 정의
	{
		run();
		for(int i = 0; i < count; i++)
		{
			jump();
		}
		 	turn();
	}
	
	
	/*
	final public void getest()
	{
		System.out.println("final이 메서드에 할당 될 경우 : 오버라이딩 불가");
	}
	
	public void gotest2()
	{
		System.out.println("메소드에 final이 없을 경우 오버라이딩 가능");
	}
	*/
	
}
