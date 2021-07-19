package Day01;

       	//모든 클래스는 object 클래스로부터 시작된다
			// java의 최상위는 object
			// 100% 클래스언어 => 100% 객체지향언어
public class Day01_1 { // class start
	
		// : 한줄 주석 [ 코드 실행시 영향x ] : 설명달기 
		/* 여러줄 주석  */

		// 클래스의 {} 안에서 코드 작성 
			// ctrl+스페이바 : 자동완성[ 이클립스 제공 ]  
		public static void main(String[] args) { // main 메소드 s
			// main 입력 => ctrl+스페이바 => 엔터 
				// main : main 스레드 
					// 스레드 : 코드를 읽어주는 역할
			// syso => ctrl+스페이바 => 엔터 
			System.out.println("java 시작");
				// System : 시스템 관련된 메소드 제공 
					// out : 출력 
						// println : 콘솔 출력 메소드
					// . : 접근연산자 
		
				// 메소드 ( : 시작 
				//       ) : 끝 
				//  ;	: 일처리 마침표 [ 한줄코드의 끝 알림 ] 
			System.out.println("안녕하세요");
		    System.out.println("함해보자");
		    System.out.println("뭘보나 java 첨보나");
		    
		    
		    System.out.println("println으로 처리하면...");
		    System.out.println("*********");
		    System.out.println("*       *");
		    System.out.println("*       *");
		    System.out.println("*********");
			
		    
		    System.out.print("print로 처리하면...");
		    System.out.print("*********");
		    System.out.print("*       *");
		    System.out.print("*       *");
		    System.out.print("*********");
			
			
		    System.out.printf("printf로 처리하면...");
		    System.out.printf("*********");
		    System.out.printf("*       *");
		    System.out.printf("*       *");
		    System.out.printf("*********");
		    
		    
			
			// 이클립스에서 제일먼저 해야할 건 	
			  // 1. 프로젝트 만들기 (Ex.. web_0714) ==> File -> New -> Project 선택해서 만들면됨. 만들고 나면 JRE System Library와 src(source) 가 자동 생성된다.
			  // 2. package 만들기 (Ex.. Day01) ==> 첫글자는 대문자로 하는게 좋다. package는 src에서 우클릭하면 나오는 선택사항 중 packge를 선택
			  // 3. class 만들기 (Ex.. Day01_1) ==> class명은 package 명에서 _를 붙여서 생성. Package명과 다른 class는 저장불가
		
			
			// 그렇게 class를 만들고 나면 main 메소드를 넣어서 "지금부터 본 class에 코딩을 시작하겠다!" 선언을 해주면 코딩을 시작하는 첫걸음은 완료
			
			// System.out.println()  괄호 안에 있는 내용 출력. 다른 명령어가 없이 원하는 문자를 출력하고 싶으면 ""로 묶어서 해야함.
			
	} // main e

}  // class end// class end