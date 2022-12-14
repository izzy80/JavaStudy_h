/*
 * 논리연산자 : &&, || ==> 결과값 boolean이다.(true/false)
 * 			(조건) && (조건)
 * 			-----    -----
 * 			  |       |
 * 			--------------
 * 				  | &&, ||
 * 				결과값 도출
 * 				&& => 직렬(조건 두개가 true일 경우에 ==> true)
 * 			
 * 			(조건) || (조건)
 * 			|| => 병렬(조건 중 한 개 이상 true이면 true)
 * 		*** && : 범위나 기간이 포함하면 90~100 A
 * 		*** || : 범위나 기간이 미포함하면 
 * 		*** 효율적인 연산 처리 ************
 * 		
 * 		실행결과
 * 
 * 		----------------------------------------------
 * 						&& 					||
 *  	----------------------------------------------
 *  	true true		true				true
 * 		----------------------------------------------
 * 		true false		false				true
 *  	----------------------------------------------
 *  	false true		false				true
 * 		----------------------------------------------
 * 		false false		flase				false
 *  	----------------------------------------------
 *  
 *  	&&연산자  두개의 조건이 true일경우에만 true 직렬
 *  	(조건) && (조건)
 *  	-----
 *  	false ================> false
 *  	
 *  	||연산자 두 개의 조건 중에 1개 이상 true ==> true 병렬
 *  	(조건) || (조건)
 *  	true  ===============> true(뒤에 있는 조건은 처리하지 않는다) ==> 효율적인 계산
 *  
 *   	
 */
public class 논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 효울적인 연산
		int a = 10;
		int b = 9;
		
		//boolean (true/false)
		boolean result = (a<b)&&++b==a; //false
		//		앞조건이	true ==> 조건 처리
		//		앞조건이	false ==> 조건 처리 없이 결과값을 출력
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//현재 b=10
		result = (a>b)||++b==a;
		//			true ==> 조건처리 하지 않음.
		//			false ==> 조건 처리
		System.out.println(result);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
