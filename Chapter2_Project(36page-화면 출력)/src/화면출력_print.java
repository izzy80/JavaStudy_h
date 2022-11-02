/*
 * 1. 변수 2. 연산자 3. 제어문 4. 화면 출력
 * ------------------------------------재사용(모아서 저장) => 메소드, 클래스 (해킹 => 데이터 보호(캡슐화)) => 상속, 포함
 * 위의 기능을 가지고 프로그램 짬. 재사용할 수 있게 하려면 모아서 저장해야 함.
 * 모으는 기능을 만들어 준게 메소드, 자바의 핵심은 메소드 안에 다 있다.
 * 그런데 요즘 해킹이 문제라 데이터를 보호하도록 캡슐화한다. 필요할 때 가져다 쓰도록 상속, 포함
 * 
 * 1. 프로그램 (소스 코딩 반복) => 응용
 * 
 * 	데이터 저장 ==> 데이터 조작 ==> 화면 출력
 * 		(변수)		연산자, 제어문
 * 
 * 	데이터형 : 메모리 크기 (기본형)
 * ------------------------------
 * 정수
 * 	byte(1byte) : -128~127
 * 	***int(4byte) : 일반 정수 저장 ==> -21억 4천 ~ 21억 4천 
 * 	***long(8byte) : 빅데이터, 챗봇
 * 실수
 * 	***double(8byte) : 소수점 15자리
 * 문자
 * 	char(2byte) : 0~65535 => 모든 문자는 번호 'A'(65), 'a'(97),'0'(48)
 * 				*** 연산처리시에 정수형으로 변경
 * 				*** 조만간 참조변수 배우면 char 안 쓰고 String 많이 사용. 
 *   # 양수만 취급. 
 * 
 * 논리 
 * 	***boolean(1byte) : true/false
 * 
 * 데이터형 크기 => 필요시에는 언제든지 데이터형을 변경하기 위해(형변환)
 * -------------
 * byte < char < int < long < float < double
 * 연산처리는 데이터크기를 따라간다. 가장 큰 데이터의 결과값이 나온다. 실수가 항상 크다. 
 * ex)
 * int + long = long
 * double + int + char = double
 * 10(int) + 10.5(double) ==> 20.5(double)
 * --
 * 10.0
 * 10.0 + 10.5 ==> 20.5 ==> 자동 형변환
 * 
 * -----------------------------------------------------------------------------복습 끝!!
 * 	화면 출력 ==> 36page
 * 	System.out.println() ==> 세로 출력 ==> ln(new Line): 출력하고 다음 줄에 출력해라. 
 * 	System.out.print() ==> 가로 출력(옆으로 계속 출력)
 * 	System.out.printf() ==> 서식
 * 		=> %d , %c , %f, %s
 * 			-------------------
 * 			%d : 정수
 * 			%c : 문자
 * 			%f : 실수
 * 			%s : 문자열
 * 			---%o(8진법) , %x(16진법), %e(지수 출력), %b(boolean 출력) : 오늘만 등장
 * 
 * 	특수문자
 * 	------
 * 		\t => tab : 일정 간격 처리
 * 		\n => 다음 줄 출력 : newLine
 * 		\" => 경로명
 * ---------------------------------------------
 * 	
 * 
 * 
 * 
 * 
 * 					----------
 */
public class 화면출력_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//println()
		System.out.println("Hello");
		System.out.println("Java");
		//결과
		//Hello
		//Java
		
		System.out.print("Hello ");
		System.out.print("Java");
		//결과 => Hello Java
		
		System.out.print("Hello\t");
		System.out.print("Java");
		//결과 => Hello	Java
		
		//System.out.print("\n") = System.out.println()
		System.out.print("Hello\n");
		System.out.print("Java");
		//결과
		//Hello
		//Java
		
		System.out.printf("%s,%s","Hello","Java");
		//결과 => Hello,Java
		
		System.out.printf("국어점수:%d",80);
		//결과 => 국어점수:80
		System.out.println("평균:"+(85/3.0));
		//결과 => 평균:28.333333333333332
		System.out.printf("평균:%.2f",(85/3.0)); //소수점, 간격을 설정
		//소수점 이하 두자리 출력
		//결과 => 평균:28.33
		
		// %5d %-5d ==> 3자리 숫자
		System.out.printf("%5d%5d%5d",90,80,70);
		//앞에서 부터 5칸
		//결과 =>   90   80   70
		
		System.out.printf("%-5d%-5d%-5d",90,80,70);//jdk 1.5부터 생긴 기능 ==> c언어의 printf모방
		//결과 => 90   80   70
		
		System.out.println("90   80   70"); 
		System.out.println(90+"   "+80+"   "+70);
		//결과 => 90   80   70
		//위랑 결과가 같음. 근데 너무 불편
	}

}
