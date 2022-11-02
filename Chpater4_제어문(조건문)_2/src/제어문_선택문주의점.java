/*
 * 1. switch( )
 * 		     ↑ 정수 / 문자 / 문자열
 * 2. 변수 선언
 * 		switch(no)
 * 		{
 * 			case 1:
 * 				int a = 10;
 * 				break;
 * 			case 2:
 * 				int a = 20;
 * 				break;
 * 			case 3:
 * 				int a = 30;
 * 				break;  ==> 오류 발생
 * 		switch(no)
 * 		{
 * 			case 1:
 * 			{
 * 				int a = 10;
 * 			}//a는 사라진다.
 * 				break;
 * 			case 2:
 * 			{
 * 				int a = 20;
 * 			}//a는 사라진다. 
 * 				break;
 * 			case 3:
 * 			{
 * 				int a = 30;
 * 			}//a는 사라진다.	
 * 				break;  ==> 오류 발생
 * 
 * 
 * {
 * 		어떤 위치든 설정이 가능하다
 * }
 */
public class 제어문_선택문주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 40; //main 전체에서 사용 ==> {} 안에서만 사용되는 변수 ==> 지역변수(블록변수 : 블록 안에서만 사용됨) : 반드시 초기화가 필요하다. 
		//↑ if 전체에서 사용하고 싶을 때 사용
		if(true)
		{
			int a = 10;
			if(true)
			{
				int b = 20;
				if(true)
				{
					int c= 30;
				}// c
				//int c = 100; 가능하다. c는 위에서만 사용 가능하므로
				// c = 100;은 사용할 수 없음. 기존 c가 사라졌으므로 데이터 타입을 붙여야함.  
			}//b
			//int b = 200;
		}//a
		//int a = 100;
	}

}
