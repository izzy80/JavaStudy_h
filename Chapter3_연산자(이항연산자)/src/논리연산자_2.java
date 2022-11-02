/*
 * if/for
 * ------(조건)
 * 
 * 1) 구구단 ====== 2차 for
 * 2) 페이지 나누기(o) =======1차 for문 (조건문 ==> &&)
 * 
 * 난수 발생 ==> 1~100 50 <
 * 알파벳 ==> k>  && 두가지를 동시에 만족
 * 
 * 
 * 
 */
public class 논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =(int)(Math.random()*100)+1;
		//				0.0~0.99 ==> 0.0~99.0 => 0~99 => 1~100
		/*
		 * Random r = new Random();
		 * r.nextInt(100) => 위에 보다 쉬운 라이브러리가 존재하긴 함. 
		 */
		char b=(char)((Math.random()*26)+65);//0~25 + 65 ==> 65~90
		//		------------------------------
		//		Math~65에 ()안 쓰면, char + 65 ==> int
		System.out.println("a="+a);
		System.out.println("b="+b);
		//boolean result = a>50 && b<'K';
		//System.out.println(result);
		
		boolean result = a>50 || b<'K';
		System.out.println(result);
		//조건 검색
		
	}

}
