import java.util.Scanner;

public class TestSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		점수를 입력하시오
//		95점 이상이면 A+등급
//		93점 ~ 94점 A등급
//		92점 이하면 A-등급
//		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오 : ");
		
		int score = scan.nextInt();
		String grade = "";
		
				
		if (score >= 95 ) {
			grade ="A+";
		} else if (score >= 94){
		grade ="A";
			
		} else if (score <= 92)
		  { grade ="A-";
		 
		  }
		  
		  System.out.println("당신의 점수는" + score +"이고 등급은"+
		  grade + "입니다");
		  
		  
		
		
		
			
		
		
	}

}
