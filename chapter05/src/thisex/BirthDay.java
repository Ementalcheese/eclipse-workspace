package thisex;

import thisex.BirthDay;

public class BirthDay {

	int day;
	int month;
	int year;
	
	public void setYear(int yaer)
	{
		this.year = year;
	}
	public void printThis()
	{
		System.out.println(this);
	}
	
	public static void main(String[] args) {
	
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
		
		
		
	}

}
