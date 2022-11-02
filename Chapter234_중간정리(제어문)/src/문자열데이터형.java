/*
 * 	문자열 ==> String (클래스)
 * 			데이터형, 클래스형(문자열 관련 기능)
 * 	사용법)
 * 			String 변수명 = ""
 * 	기능) 
 * 			비교 : equals, equalsIgnoreCase()
 * 				 -------- ------------------
 * 				대소문자 구분  대소문자 구분없이 구분
 * 				admin	Admin(false) admin Admin(true)
 * 				==> 로그인 검색 
 * 			문자열길이 : length()
 * 			문자 1개 : CharAt()
 * 			---------------------
 *	
 */
public class 문자열데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		//		  0123456789
		System.out.println(s.length());// 공백도 문자임
		System.out.println(s.charAt(0)); //첫번째 문자를 잘라와라.
		System.out.println(s.charAt(5));
		
		// 문자 꺼꾸로 가져오기
		for(int i=s.length()-1;i>=0;i--) //-1안 해주면 오류남. 0번부터 시작해서
		{
			System.out.print(s.charAt(i));
		}
	}

}
