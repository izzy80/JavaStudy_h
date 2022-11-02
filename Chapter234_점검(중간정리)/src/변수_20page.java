/*
 * 		변수 : 한 개의 데이터를 메모리에 저장하는 공간
 * 		-----
 * 		기본형(자바에서 지원하는 메모리 크기) ==> 1byte, 2byte, 4byte, 8byte
 * 			메모리 크기(컴퓨터는 무조건 0,1만 저장이 가능) => 0이나 1을 하는 공간 ==> bit
 * 			=> bit => bit(8) byte
 * 
 * 		정수
 * 		byte ==> 1byte 크기의 메모리를 만들어 저장이 가능하게 만들어 준다. 
 * 				----------------------------------------------
 * 				0 1 1 1 1 1 1 1
 * 				--
 * 				부호비트(0 => 양수, 1=> 음수)
 * 				-------------------------------------------------
 * 										2^0*1
 * 									2^1*1
 * 								2^2*1
 * 							2^3*1
 * 						2^7*1
 * 						------------->-128~127
 * 					네트워크(웹) => 파일업로드 / 파일 다운로드, 채팅 문자열
 * 
 * 	int ==> 4byte : 일반적으로 정수표현 (default => 컴퓨터에서 정수가 입력되면 ==> int)
 * 	long ==> 8byte : 금융권...(빅데이터)
 * 실수
 * 	double ==> 8byte : 소수점 ==> 15자리
 * 문자 
 * 	char ==> 2byte(음수가 없다 ==> 0~65535) => 1byte(싱글~ASC), 2byte(멀티~유니코드)
 * 			한글(한글자당 => 2byte)
 * 			=> String : 문자열
 * 논리
 * **참조형(프로그래머가 직접 메모리 크기 제작) => 기본형 여러개를 묶어서
 * 	1) 배열 : 같은 데이터만 묶어서 관리
 * 	2) 클래스 : 다른 데이터 여러개를 묶어서 관리(*****)
 * 
 * *** 저장된 값?
 * *** 데이터형
 * *** 변경되는 값이 있는가?
 * 
 * 변수 설정
 * --------
 * 데이터형 변수명;
 * ------
 * 기본형
 * int (변수명)
 * -------------------참조(메모리 주소를 가지고 제어) => 다음주
 * 배열
 * int[] (배열명)
 * 클래스
 * Student 객체
 * --------------------------
 * 
 * 식별자 : 변수, 상수, 클래스명, 배열명, 인터페이스, 메소드
 * --------------------------------------------------
 * 1) 알파벳, 한글로 시작한다 (권장 : 알파벳 => 운영체제마다 한글 표현이 다르다)
 * 	=> 알파벳은 대소문 구분
 * 2) 숫자를 사용할 수 있다.
 * 	=> 앞에 사용금지
 * 3) 특수문자 사용이 가능(_,$)
 * 4) 키워드는 사용 금지(지원에 자원하는 단어)
 * 	if, for, while, do, int, double...
 * 5) 변수의 길이는 제한하지 않는다(3~7)
 * 	----------> 클래스명은 대문자 시작 String, System..
 * 				변수나, 메소드 소문자 시작
 * 				상수는 전체를 대문자 ==> 권장사항 ==> 분석이 쉽게 만든다. 
 * 
 * => 변수 선언, 상수 선언
 * 데이터형 변수명 ------------------> 선언 => 초기화, 선언과 초기값(변경이 가능)
 * final 데이터형 변수명 -------------> 선언과 동시에 초기화(변경 할 수 없다)
 * 
 * *** 변수 선언(국어, 수학, 영어)
 * 		int kor;
 * 		int math;
 * 		int eng;
 * 		
 * 		int kor, math, eng; 
 * 		--------------------------사용이 불가능
 * 		변수 선언후에는 반드시 초기화
 * 		-------------------------
 * 		int kor;
 * 		kor =100;
 * 	
 * 		int kor = 100;
 * 		---------------------
 * 		여러개
 * 		int kor=0;eng=0;math=0;
 * 	*** 초기화 방법
 * 		명시적 초기화 : int a = 100;
 * 		입력값 : int a = scan.nextInt()
 * 		난수 : int a = (int)(Math.random())
 * 	***변수의 표현법
 * 		doubel ,float ==> F(f)
 * 		int, long ==> L(l)
 * 		정수표현법
 * 			100 => 10진법
 * 			012 => 8진법
 * 			-
 * 			0xff => 16진법 (color) 0xFFF, 0x000
 * 			--
 * 	------------------------------------------------
 * 	문자열 결합
 * 	----------
 * 	7+""+7 ==> "77" (문자열이 연산되면 무조건 ==> 문자열)
 * 
 * 강제 형변환
 * 	int a = (int)10.5; ==> a=10
 * 	형변환 : boolean(제외)
 * => 연산처리(연산 => 항상 같은 데이터형만 연산이 가능) ==> 큰 데이터형으로 변환
 * 						----------
 * 	10+10.5
 * 	--
 * 	10.0
 * 	------------------10.0+10.5 => 20.5
 * 
 * 	'A'+1
 * 	--
 * 	65
 * 	---------------65+1=66
 * 	(int)(Math.random()*100)
 * 	
 * 	형변환 : (int)"10" ==> 문자열은 형변환이 불가능(변경 ==> 라이러리) : Wrapper 클래스
 * 			웹, 윈도우 ==> 모든 입력값, 출력값 => String(문자열)
 * 	*** 프로그램에 맞게 데이터형을 변경해서 사요할 수 있다 (기본형, 클래스형)
 * 	82/83 ==> 자동 형변환
 * 	*** int 이하 데이터형(byte, short, char) ==> 연산처리가 되면 int
 * 		byte + byte = int
 * 		char + char = int
 * 		byte + char = int 
 * 
 *  데이터 저장 	=====> 	사용자 요청 처리 ============> 결과
 *  --------			------------
 *  						연산자
 *  사용자 : id, pwd			id.equals("admin") && pwd.equals("1234")
 *  사용자 : kor, math, eng 	총점, 평균 ==> +,/
 *  ----------------------메모리 (ram)
 *  영구적 저장 : 파일, 오라클
 * 		
 * ------------------------------------------------------
 * 3. 데이터형 ==> 27,28,29(종류, 사용처, 크기)
 * => 표현법 32(도표)
 * => 35 => 문자열
 * => 57 => \t,\n,\,\\(특수문자)
 * 			tabk, newline, \\경로
 * => 59 => 숫자/문자('A', 'a','0')
 * 					65, 97, 48
 * => Upcasting(데이터형이 커진다) => 자동형변환
 * => Downcasting(데이터형을 작게 만든다) => 강제형변환
 * 	-> Up
 * byte < char < int < long < double <- Down
 */
public class 변수_20page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 10.5F;
		System.out.println(10000000000000L);
		System.out.println("f="+f); //f=10.5

	}

}
