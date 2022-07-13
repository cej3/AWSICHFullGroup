import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		중첩 if문
//		
//		boolean 조건식1;
//		if(조건식1) {
//			조건식1의 연산결과가 true일 때 
//			
//			if(조건식2) {
//				조건식2의 연산결과가 true일 때 
//				
//			}else {
//				조건식1이 true이고, 조건식2가 false일 때
//			}
//			
//			
//		}else {
//			조건식1이 false 일 때
//		}
		
//		95점 이상이면 99이하 A+등급
//		93점 ~ 94점 A등급
//		92점 이하면 A-등급
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade ="";
		
//		유효성
//		if(score > 100) {
//			System.out.println("점수는 100점을 넘을 수 없습니다.");
//		}
		
		if (score > 90) {
			grade ="A";
			
			if(score >= 93) {
				grade = "A";
			}
			
			if(score >= 90) {
				grade = "A-";
			}
			
			if(score >= 93) {
				grade = "A";
			} else if(score >= 90) {
				grade = "A-";
			}
			
//		}else if (score >= 93 && score <= 94 ) {
//			grade = "A";
//		}else if (score <= 92) {
//			grade = "A-";
//			
//			if(score >= 93) {
//				grade = grade + "-" ;
//			}
//		}
		
		System.out.println("당신의 점수는 " + score + "점 이고 등급은" + grade + "입니다.");
					
		
			
	}
	}
}


