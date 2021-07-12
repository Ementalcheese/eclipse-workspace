package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student studentJames = new Student("James", 5000);     //학생
		Student studentTomas = new Student("Tomas", 10000);    //두명 생성
		
		Bus bus100 = new Bus(100);       // 100번 버스 생성
		studentJames.takeBus(bus100);    // James가 100번 버스를 탐
		studentJames.showInfo();         // James의 정보 출력
		bus100.showInfo();              // 버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");   //노선번호2 지하철 생성
		studentTomas.takeSubway(subwayGreen);       //Tomas가 2호선을 탐
		studentTomas.showInfo();                   //Tomas 정보 출력
		subwayGreen.showInfo();                   //지하철 정보 출력
		
		
	}

}
