
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if-else if문
//		
//		if(조건식) {
//			조건식1의 연산결과가 true일 때 수행 될 문장들
//		} else if(조건식2){
//		      조건식1의 연산결과가 true일 때 수행 될 문장들		
//			
//		  else if(조건식2){
//			  조건식2의 연산결과가 true일 때 수행 될 문장들		
//		  else if(조건식3){
//		      조건식3의 연산결과가 true일 때 수행 될 문장들
//	} else { 
//		위의 어느 조건식도 만족하지 않을 때 수행 될 문장들
//		
		
		
//		학점을 등급으로 표현하는 프로그램 만들기
//		100이하 90이상이면 A 
//		89이하 80이상이면 B
//		80미만 70이상이면 C
//		70미만 60D이상이면 D
//		나머지는 F로 학점을 매긴다.
		
//		점수는 사용자 키보드 입력을 받는다. (조건)
//	
//		출력.
//		당신의 점수는 ??이고 등급은 ??입니다.
		
		
		int score = 0;
		String  gradeStr = "";
		
		score = 95;
		
		if(score >= 90) {
			gradeStr = "A";
		}else if(score >= 80) {
			gradeStr = "B";
		}else  {
			gradeStr = "F";
			}
		
		System.out.println("당신의 학점은" + gradeStr + "입니다");
//		}
	
		
		}
		
	}


