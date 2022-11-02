/*
 * 형변환 연산자 : (type) 
 * 				----- 데이터형
 * 				(int), (double), (char)....
 * 				------ 2byte
 * 
 * 				크기
 * 				byte < char < int < long < double
 * 				--------------------------------- boolean은 형변환 할 수 없다. ==> 사용자 정의 데이터형(class)
 * 				1) 실수 ==> 정수로 변환
 * 					(int)10.5 ==> 10
 * 				2) 정수 ==> 문자로 변환
 * 					(cahr)65 ==> 'A'
 *  			3) 10 ==> 10.0 ==========>자동 형변환이 가능
 *  				(double)10 ==> double d=10; ==> d=10.0
 *  			4) 10.5 + 10.5 ==> 21.0
 *  				(int)10.5 + (int)10.5 = 20
 *  				----------   --------
 *  					10    +   10
 *  				(int)(10.5+10.5) ==> 21
 *  						--------21
 *  				-------- 21
 *  					#형변환 잘못 시키면 오차가 발생
 * 					
 * 					==> 최우선순위연산자 이용 ==> ()
 * 					5+6*10 ==> 65
 * 					(5+6)*10 ==> 110
 * 
 * 					서울시 강남구 역삼동
 * 					char a1 = '서' -> char변수가 11개가 필요
 * 					따라서 "서울시 강남구 역삼동" 한꺼번에 묶어서 저장.
 * 					String addr = '서울시 강남구 역삼동' 
 * 
 * 
 * 
 * 
 * 
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		int a;
		// 난수
		a = (int)(Math.random()*100)+1; // ==> 데이터값 넘겨줄 때 double
		//        -----------------1 ==> Math.random() ==> 0.0 ~ 0.99*100 ==> 0.0 ~ 99.0
		//   ----2 ==> 0 ~ 99
		//                          --3 ==> 1~100사이의 숫자
		System.out.println(a);
		// greater than or eqal to 0.0 and less than 1.0
		
		char c;
		c = (char)((Math.random()*25)+65);
		//         ------------------ 0~24 + 65 ==> 65 ~ 89
		System.out.println(c);
		
		char d = 'A';
		char d1 = (char)(d+32);
		System.out.println(d1);
		// 대문자를 소문자로 바꾸는 방법. 32차이가 난다.
		
		char e = 'a';
		char e1 = (char)(e-32);
		System.out.println(e1);
		//소문자를 대문자로 바꾸는 방법
		
		//자동 형변환
		//다른 데이터형에 값을 대입
		int i = 'A'; // 'A' => 65
		long l = 100; //long <= int(int는 long 변경) ==> l = 100L
		int i2 = (int)10.5;
		/*
		 *  변수 = 값
		 *  ---  ---
		 *  큰    작은 값 ==> 자동 변환 => UpCasting(자동 형변환)
		 *  
		 *  변수 = 값
		 *  ---  ----
		 *  작은   큰 값 ==> 자동 변환 불가능 (강제 변환) ==> DownCasting(강제 형변환)
		 *  
		 *  프로그램에서 필요시에 의해서 데이터형을 변경해서 사용할 수 있다. 
		 *  ================================================
		 *  형변환 : 외부에서 데이터 가지고 올때 (파일, 오라클, 라이브러리)
		 *  
		 *  int a = 'A'; ==> a = 65 
		 *  -----------         
		 *  일부러 이렇게 쓸 필요는 없다.
		 */
		 int m = 10;
		 int n = 3;
		 System.out.println(m/n); //정수 / 정수 = 정수(실수x)
		 System.out.printf("%.2f",m/(double)n);
		 
		 // 음수/양수 (-/+)
		 int k = 10;
		 System.out.println(-k); // .(주소 접근지정 연산자), [](배열)
		 

	}

}
