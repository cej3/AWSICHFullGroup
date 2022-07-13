
public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if-else문
//		
//		if(조건식) {
//			조건식이 참일 때 수행 될 문장을 적는다.
//		}else {
//			조건식이 거짓일 때 수행 될 문장을 적는다.
//		}
		int visitCount = 0; // 여기 초기값은 바꾸지않음 되도록 그래서 대입연산자를 쓰는거임 . 
		
		// visitCount = 10; < 대입 연산자 
		
		visitCount = 0;
		if(visitCount <1) {
			System.out.println("처음 오셨군요.");
			System.out.println("방문해 주셔서 감사합니다");
			
		}else {
			System.out.println("또 오셨군요");
			System.out.println("방문 횟수는"+ visitCount + "입니다");
		
			
			
//			재방문했다면 이렇게 출력되도록 프로그램을 만들어주세요
//			> 다시 방문해 주셔서 감사합니다.
//			> 방문횟수는 2번 입니다. 라고 출력되도록 해주세요.
		
		}
		
	}

}
