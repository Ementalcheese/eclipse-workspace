package arraytest;

public class Test4 {

	public static void main(String[] args) {
		
		//2차원 배열로 4년 평점 구하기
		
		double score[][] = {{3.3,3.4},   //1-1,2 평점
			            	{3.5,3.6},   //2-1,2 평점
			            	{3.7,4.0},   //3-1,2
			            	{4.1,4.2}};  //4-1,2
		
		double sum = 0;
		for(int year = 0; year < score.length; year++)           //각 학년별로 반복
			for(int term=0; term < score[year].length; term++)   //각 학년의 학기별로 반복
				sum += score[year][term];                        //전체 평점 합
		
		int n = score.length;         //배열의 행 개수 4
		int m = score[0].length;      //배열의 열 개수 2
		System.out.println("4년 전체 평점 평균은" + sum/(n*m));
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}                     

}
