/*
 * 		변수 : 한개의 데이터를 저장하는 메모리 공간 20 page
 * 			-----------
 * 			변경해서 사용할 수 있는 변수
 * 			=> 변수는 반드시 초기화를 해야 한다. 
 * 		1) 메모리의 크기(데이터형,기본형, 자료형) ==> 자바에서 지원하는 메모리 크기(사용자 정의 : 배열, 클래스(참조변수)) ==> 27page
 * 			기본형
 * 			*** 데이터는 필요시에는 변경이 가능하다. (int => long) (char => int) (double => int)
 * 			... 맛집 평점 4.1, 4.3, 4.5 ... => 4 $4인걸 다 가져와라하기 위해. 각각 숫자로 조건문을 걸으면 너무 어려움. 검색시에 유용. 
 * 					=> 29page
 * 					정수
 * 					byte (1byte = 8bit) => -128 ~ 127 (네트워크 전송, 파일)
 * 					int	(4byte = 32bit) => -21억 4천 ~ 21억 4천(일반적으로 사용하는 숫자)
 * 					long (8byte = 64bit) => 접미어 (L,l) 100L문자형 아니라 long형
 * 				실수
 * 					double (8byte = 64bit) => 소수점 15자리수 
 * 				문자
 * 					char (2byte = 16bit) => 0~65535 ==> 연산처리시 정수로 변경
 * 				논리
 * 					boolean (1byte = 8bit) => true/ false
 * 			2) 각 데이터형의 초기화 ==> 21page
 * 				byte b=10; ==> 0
 * 				int i = 100; ==> 0
 * 				long k=100L; ==> 0L
 * 				double d = 10.5; ==> 0.0
 * 				char c='A'; ==> '\0'
 * 				boolean bb = true; ==> false
 * 										------default
 *				$초기값은 아무거나 써도 괜찮. 나중에 바꾸면 되니까!!! 
 * 			3) 다른 변수의 값을 교환 ==> 23page
 * 				int a = 10;
 * 				int b = 20; ==> a=20, b=10
 * 				=> 임시변수 설정
 * 				int tmp=a;
 * 				a = b;
 * 				b=tmp;
 * 				$sort할때 등장. 
 * 			4) 상수, 리터럴, type, 변수 => 31page
 * 				상수 = 변하지 않는 값(변경이 불가능, 반드시 선언과 동시에 값을 설정)
 * 						final 데이터형 상수명 = 값
 * 						-----
 * 				리터럴 : 실제 저장 된 값
 * 						int a = 100; ==> 100
 * 				type : 데이터형 int a = 100; type => int
 * 			*** 변수는 범위를 벗어나는 경우 오버 플로우가 발생
 * 				byte b = 300;
 * 				-------------
 * 					256 128 64 32 16 8 4 2 1(0) $300에 가장 가까운 숫자부터
 * 					 1			1	 1 1	
 * 				--------------------------------
 * 					1   0   0   1  0  1 1 0 0   -> byte(8bit) 
 * 						----------------------
 * 						=> 32 + 8 + 4 ==> 44 (오버플로우) $ 범위를 벗어나면 숫자가 다른 숫자가 나올 수 있다.
 * 			5) 35page
 * 				문자열 결합 (+)
 * 				"나이:"+30 ==> "나이:30"
 * 				"" => 문자열
 * 				문자열 + any type(모든 타입) ==> 문자열
 * 				any type + 문자열
 * 				
 * 				7+""+7 =>
 * 				======
 * 				"7"+7 ==> "77"
 * 				7 + ""+7+7 ==> "777"
 * 				------
 * 					"7"
 * 					----
 * 						"77"
 * 						----
 * 							"777"
 * 			7+7+""+7
 * 			---
 * 			14
 * 			 ----
 * 				"14" $문자로 변환
 * 				-----
 * 				 "147"
 * 			7+""+7+7 ==> "777"
 * 			7+""+(7+7)
 * 				------
 * 				14
 * 			----
 * 			"7"+14 ==> "714"
 * 			모든 프로그램 ==> 컴퓨터에 명령을 내린다. ==> 수행
 * 						----------------순서 => 알고리즘
 * 			"true" + true ==> "truetrue" ==> +
 * 
 * 
 * 
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		int tmp = a;
		a=b;
		b=tmp;
		
		System.out.println("a="+a+","+"b="+b);
		//System.out.println("a="+a);
		//System.out.println("b="+b);
		//System.out.printf("a=%d",a); //서식을 주고 서식에 맞추어서 출력
	}
//JDK1.8 ==> JDK1.9 ~ => 유료
//openjdk
}
