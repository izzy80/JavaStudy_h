/*
 *  % 나누고 나머지값 ==> 자바스크립트 : %, 오라클 : MOD() <- 함수, EL : 5 mod 2
 *  -------------------------------------------------------------------
 *  자바(==) , 오라클 (=), 자바스크립트 (===) : ES5(==), ES6(===), ES8
 *  									 var       let, const
 *  JSP ==> HTML(ThymeLeaf)
 *     Front Back 
 *  화면---- 	 ----서버   => 삼성(VueJS <=> SpringBoot), 현대(React <=> SpringBoot)
 *  JDBC / MyBatis / JPA
 *  
 *  ==> 부호 (결과값은 왼쪽편 부호가 남는다)
 *  
 *  
 *  
 *  
 *  
 *  
 */
public class 산술연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 2;
		
		System.out.printf("%d%%%d=%d\n",a,b,a%b);
		System.out.printf("%d%%%d=%d\n",-a,b,-a%b);
		System.out.printf("%d%%%d=%d\n",a,-b,a%-b);
		System.out.printf("%d%%%d=%d\n",-a,-b,-a%-b);
		// -5*-5 ==> 25, -5*5 => -25 (*,/는 우리가 평소 계산하는 것과 똑같다.) 

		int c = 367;
		System.out.println(c%10);
		System.out.println((c%100)/10);
		//====> 367%100 ==> 67/10 ==> 6
		System.out.println(c/100);
		// 입력을 받아서 윤년여부 확인 ==> 알고리즘 공식(예매)
	}

}
