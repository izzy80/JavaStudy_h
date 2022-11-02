/*
 * 	= 평문 => 순차적으로 처리가 되게 만든다. 
 * 	= 조건 따라서 건너뛸 수 있게, 반복적으로 수행 ==> 프로그램 흐름을 변경 ==> 제어문
 * 		=================> 제어문 : 연산자응용
 * 							============= 한개의 기능 (메소드)
 * 	= 웹, Application, Mobile ==> 변수, 연산자, 제어문
 * 	= 객체 지향 프로그램 (어렵게 만들었다) => 단가를 올리기 위해서
 * 형식)
 * if(조건) ==> 결과값(boolean) ==> 부정연산자, 비교연산자, 논리연산자 ==> 삼항연산자
 * {
 * 		조건이 true일때 수행문장
 * }
 */
// 1. 정수를 입력을 받아서 짝수, 홀수
public class 조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =(int)(Math.random()*100)+1;//1~100까지 정수 한개를 추출해라 => ; 명령문
			if (a%2==0)
			{
				System.out.println(a+"는(은) 짝수입니다!!");
			}
			if (a%2==1) //a%2 != 0 or !(a%2==0)
			{
				System.out.println(a+"는(은) 홀수입니다!!");
			}
	}

}
