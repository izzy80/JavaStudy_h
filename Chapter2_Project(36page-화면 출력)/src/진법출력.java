//42page ~ 74page(형변환)
/*
 * 진법, 지수 ==> SQL ==> 임베디드할 때는 중요하지만 우리는 소프트웨어라 중요하지 않음.
 *                     AWS기반 FullStack(Back-end, Front-end : Javascript(Ajax, VueJS, ReactJs, NodeJs)
 *                     ------		    -------
 *                     클라우드			자바, JSP, Oracle, Spring 
 * 1. 변수 설정
 * 2. 연산자 ==> 3장
 * 3. 제어문 ==> 4장
 * 4. 메소드 ==> 
 * 5. 클래스 (객체지향) ==> 6,7장 
 * 6. 예외처리 => 8장
 * 7. 라이브러리(컬렉션, 제네릭스) ==> 11, 12장
 * 8. IO ==> 15장
 * ------------------------------------------------------------------
 * 자바에서 정수 표현
 * 1) 10진법 : 10, 20, 30....
 * 2) 2진법: 0,1
 * 3) 8진법 : 0 ~7 ==> 0~~
 * 4) 16진법 : 0~9 + 10(A),11(B),12(C),13(D),14(E),15(F) ==> 0x~~
 * 
 * 27 ==> 2진법
 * 32 16 8 4 2 1(0)
 * 0  1  1 0 1  1   ==> 11011
 * 
 * 1 1 0 1 1
 * 		----
 * 		3
 * ----
 * 3				==> 033(뒤에서 3개씩 짜름)
 * 
 * 11011
 * 	----
 * 	 11
 * -
 * 1			==> 0x1B(뒤에서 4개씩 짜름)
 * 
 * 
 * 
 * 
 * 
 */
public class 진법출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27)); //2진법
		System.out.println("0"+Integer.toOctalString(27)); //8진법 033
		System.out.println("0x"+Integer.toHexString(27)); //16진법 0x1b
	}

}
