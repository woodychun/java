package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
	System.out.print("정수입력 : "); int 문제3 = scanner.nextInt();
	// 배수찾기 : 값%수 == 0 	[ 나머지가 0 이면 값은 그수의 배수 ]
	System.out.println("입력하신 값은 7의배수 : " + (문제3%7==0) );
	
		//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
	System.out.print("정수입력 : "); int 문제4 = scanner.nextInt();
	// 홀수/짝수찾기 : 값%2 == 0  [ 값%2 했을때 나머지가 0이면 값은 짝수 나머지가 1 이면 값은 홀수 ]
	System.out.println("입력하신 값은 홀수 : " + (문제4%2==1) );
	
		//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
	System.out.print("정수입력 : "); int 문제5 = scanner.nextInt();
	System.out.println("입력하신 값은 7의 배수 이면서 짝수 : " + ( 문제5%7==0 && 문제5%2==0 ) );
	
		//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
	System.out.print("정수1입력 : "); int 문제6_1 = scanner.nextInt();
	System.out.print("정수2입력 : "); int 문제6_2 = scanner.nextInt();
	System.out.println("두 정수중 정수1 더 크다 : " + (문제6_1>문제6_2) );
	
		//문제7 : 반지름을 입력받아 원 넓이 출력하기 
			// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
	System.out.print("반지름 : "); int 문제7 = scanner.nextInt();
	double 원넓이 = 문제7 * 문제7 * 3.14;
	System.out.println("입력한 반지름의 원넓이는 : " + 원넓이 );
	
		//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
			// 예) 54.5   84.3 이면    64.285714%
	System.out.print("실수1 : "); double 문제8_1 = scanner.nextDouble();
	System.out.print("실수2 : "); double 문제8_2 = scanner.nextDouble();
	double 비율 = (문제8_1/문제8_2) * 100 ;	
	System.out.println("실수1의 실수2의 백분율 : " + (비율) + "%");
	System.out.printf("실수1의 실수2의 백분율 : %.2f%%", 비율 );
						// 형식문자 : %f [ 실수 ]
							// %.숫자f [숫자 : 소수점 자리수 ]
								// %.2f [ 소수점 2자리수 ] 

		//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
			//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
		//문제10: 키를 정수를 입력받아 표준체중 출력하기
			//표준체중 계산식 = > (키 - 100) * 0.9
		//문제11: 키와 몸무게를 입력받아 BMI 출력하기
			//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		//문제12: inch 를 입력받아 cm 로 변환하기
		//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
			//소수 둘째 자리 까지 점수 출력하기
			//중간고사 반영비율 => 30 %
			//기말고사 반영비율 => 30 %
			//수행평가 반영비율 => 40 %
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)


		
		
		
	}

}
