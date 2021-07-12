package chapter04;

public class If_example06 {

	public static void main(String[] args) {
		
		int score = 101;
		char grade = 0;

		if(score > 100) {
			System.out.println("점수오류");
			grade = 0;
		}
		
		else if( score >= 90 ) {
			grade = 'A';
			
		}
		else if(score >= 80 ){
			grade = 'b';
		}
		else if(score >= 70) {
			grade ='c';
		}
		else if(score >= 60) {
			grade = 'd';
		}

		else {
			grade ='f';
		}
		
			System.out.println(grade +" 학점 입니다.");
		
	}

}
