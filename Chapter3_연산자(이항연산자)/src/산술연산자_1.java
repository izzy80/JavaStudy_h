/*
 * 이항연산자(피연산자가 2개인 경우)
 * -------------------------
 * = 산술연산자(+, -, *, /, %) ==> 97page
 *	 우선순위 : *, /, % => +, -보다 우선순위 연산이 된다. 
 *	 주의점 : 1. 형변환 (자동 형변환) => 데이터형이 다른 경우 큰 데이터형으로 변경
 *				int + char (int > char)
 *					-------
 *						int변경
 *				--------------
 *				int + int = int
 *			
 *				예) 
 *					10 + 'A'
 *						----
 *						65로 변경
 *					-----------
 *					10 + 65 = 75
 *				
 *					double + int (double > int)
 *							-----
 *							double로 변경
 *					----------------
 *					double + double = double  ** 연산은 같은 데이터형만 가능하다. 
 *										
 *					***필요시 큰 거를 작은 거로 낮추어서 계산 가능
 *					(int)double + int = int ==> 강제 형변환
 *					*** int 이하(byte, short, char)는 연산처리시에 결과값 int
 *					예) 
 *						byte + byte = int
 *						char + char = int
 *						byte + char = int
 *						short + char + byte = int
 *						------------------------------------
 *				2. / 나누기 연산
 *					1) 정수/정수 = 정수 10/3 = 3(3.33xx아님=> 소수점이하를 지운다)
 *					2) 0으로 나누면 오류가 발생한다 ==> (사용자가 0을 누르지 않도록)오류체크(예외처리) 필요
 *					
 *				3. % 나누고 나머지 ==> 화페매수 구하기, 배수, 달력(요일 구하기), 윤년 등의 문제에 등장.
 *					10%3 ==> 1
 *					부호 (-, +) ==> 결과값은 항상 왼쪽편 부호가 남는다. 
 *					10%3 = 1
 *					10%-3 = 1
 *					-10%3 = -1
 *					-10%-3 = -1
 *	= 비트 연산자 (& : and , | : or, ^ : xor)
 *	---------------------------------------------
 *					&(*)   	|(+)  		^(다른 비트일 경우 ㅂ)
 *	---------------------------------------------
 *	0	0			0		0			0
 *	---------------------------------------------
 *	0	1			0		1			1
 *	---------------------------------------------
 *	1	0			0		1			1
 *	---------------------------------------------
 *	1	1			1		1			0
 *
 *	= 쉬프트 연산자 (비트 이동 연산자) <<(왼쪽이동), >>(오른쪽 이동)
 *	10 << 3 ==> 80 => 이동후에 뒤에 3칸을 0으로 채운다. 
 *	10*2^3(8)
 *	X << Y ==> X*2^Y
 *	쉬프트는 산술로 변경해서 계산하는게 편하다. 
 *	--------------------------------
 *	1010
 *	1010000
 *	64+16 ==> 80
 *
 *	10 >> 3 ==> 1 ==> 1(010) 뒤에 비트를 3개 제거해라. 
 *	10/2^3 (8) ==> 1
 *	X>>Y ==> X/2^Y
 *	1010
 *	1
 *
 *	12 << 2 ==> 12*4 ==> 48
 *	1100
 *	110000
 *	32+16 ==> 48
 *
 *	12>>2 ==> 12/4 == 3
 *	1100 ==> 2개 지운다 ==> 11
 *
 *
 *
 *
 *
 *
 * 
 */
//두개의 정수를 받아서 +, -, /, *, % 연산후 출력
import java.util.Scanner;
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수를 입력(10 20):");
		a = scan.nextInt(); //입력된 정수값을 가지고 온다 => a라는 메모리에 저장
		b = scan.nextInt(); //b라는 메모리 공간에 저장 
		//출력
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//연산 처리
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		//				  ------------
		//					출력형식     --------- 값을 대입
		//System.out.println(a+"+"+b+"="+(a+b));
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		System.out.printf("%d/%d=%d\n",a,b,a/b);
		//System.out.printf("%d/%d=%.2f\n",a,b,a/b); //오류가 난다. 패턴을 맞게 값을 입력해야함. 
		System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b); //강제 형변환을 통해 오류가 나지 않게 할 수 있음. 
		System.out.printf("%d%%%d=%d\n",a,b,a%b); //나머지는 % 두개 써야함. 
		
		
	}

}
