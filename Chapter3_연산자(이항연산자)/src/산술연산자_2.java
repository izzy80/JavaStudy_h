/*
 * 	산술연산자 => 산술변환
 * 				연산은 무조건 같은 데이터형이여야 연산처리가 된다. 
 * 				  			  -------
 * 				다른 데이터형이 연산되면 => 큰데이터형으로 변경후 연산처리를 한다 (자동 형변환) ==> 92page
 * 									----------------자동
 * 									예) 
 * 										int + double
 * 										---
 * 										double변경
 * 										------------
 * 										double + double = double
 * 					
 * 										int + char 
 * 											------
 * 											int변경 
 * 										----------
 * 										int + int = int
 * 										*** int이하 데이터형(byte, char) ==> 결과값이 int
 * 										char + byte = int
 * 										char + char = int
 * 										byte + byte = int 
 * 									자동 데이터형으로 변경 후 연산처리
 * 									----------------강제
 * 									double + int = int
 * 									------
 * 									int로 변경
 * 									(int)double + int = int
 * 
 * 					*** 여러개의 연산이 되면 => 가장 큰 테이터형의 결과를 가지고 온다. 
 * 						char + int + double ==>
 * 						-----
 * 						int
 * 						------------
 * 						double + double = double
 * 
 * 					byte < char < int < long < float < double
 * 		
 * 
 * 
 * 
 * 
 */
public class 산술연산자_2 {
		public static void main(String[] args) {
//			int c = 'A' + 'B';
//			System.out.println(c);
			
			byte b1 = 10;
			byte b2 = 20;
			//byte b3 = b1 + b2; // 오류 : 결과값이 int이기 때문에
			//int b3 = b1 + b2;//해결방법 1
			byte b3=(byte)(b1+b2);//해결방법 2(오버플로우 발생 가능성이 있다.) 
			System.out.println(b3); 
			
			char c = 'A';
			int d = 100;
			int k = c + d;
			//c = 65 ===> 65+100 ==> 165
			System.out.println(k);
			
			//int m = 10.5 + 10.5; //오류
			// m = 4, 10.5 + 10.5 = 8 ==> 작은 메모리에 저장이 불가능하기 때문에 오류 발생(오른쪽에 있는 데이터가 작거나 같아야 대입이 가능)
			int m = (int)10.5 + (int)10.5;//해결방법 1
			/*
			 *  (int)10.5 ==> 10 ==> 소수점을 지운다
			 *  (int)10.5 ==> 10
			 *  10+10 = 20
			 *  (type) > 산술연산자보다 계산 순서가 높다. 
			 */
			int n = (int)(10.5 + 10.5); // 해결방법 2 : 이 유형을 많이 씀. 순위 결정 문제에서
			// 지니뮤직, 멜론, Mnet 순위는 약간씩 다르다   
			/*
			 * () : 최우선 순위==> 10.5 + 10.5 ==> 21.0
			 * int(21.0) = 21
			 */
			System.out.println("m="+m);
			System.out.println("n="+n);
		}
}
