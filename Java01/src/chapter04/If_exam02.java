package chapter04;

public class If_exam02 {

	public static void main(String[] args) {
		
		
		int score = 101;
		char grade = 0;

		
		if( score > 100 ) {
			System.out.println("점수 오류");
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
		

		System.out.println("점수" + score + "점 " + grade +"학점 입니다.");
			

	}

}
