/*
 * 	출력 : System.out.println(), System.out.print(), System.out.printf()
 * 	입력 : System.in(키보드 입력), Scanner, BufferedReader
 * 		---------------------           ---------------예외처리를 해야함. 
 * 	$예외처리를 아직 안 배워서 Scanner을 배워보자. 
 * 
 * 	1. 변수
 * 	1) 초기화
 * 		명시적인 초기화 int a=10
 * 		입력값 
 * 		난수
 * 
 */
import java.util.Scanner;
//java.lang ==> 생략이 가능
// Scanner은 없어서 import를 써서 불러와야한다. 
/* 자바 코딩 순서
 * 1. package : 현재 클래스의 경로 지정(한 번만 사용이 가능)
 * 2. 외부에서 다른 클래스를 읽어올 때, 
 * 		import ==> 여러 개 사용이 가능
 * 3. public class className
 * 		{
 * 			public static void main(String[] args) {
 * 			}
 * 		}
 * 클래스 안에 메인이 하나씩 존재해야함. 
 */
// Q. 국어, 영어, 수학 => 입력을 받아서 총점, 평균 출력
// 출력형식 : 가로/세로 
public class 화면출력_printf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언
		int kor, eng, math, total;
		double avg;
		
		//2. 입력값을 받아서 변수 초기화
		Scanner scan = new Scanner(System.in);
		//클래스는 new를 이용해서 메모리에 저장 
		// 새로운 메모리에 저장할 때 new를 사용 
		//System.in : 키보드 입력값
		//키보드 입력값을 저장하고 있다가 메모리에 저장해주는 것 : scanner
		// Scanner: 키보드 입력값을 받아서 해당 변수에 값을 대입
		System.out.print("국어 점수 입력:");
		kor = scan.nextInt(); // 정수값 저장, next(): 문자열, nextDouble() : 실수형 => 40page
		System.out.print("영어 점수 입력:");
		eng = scan.nextInt();
		System.out.print("수학 점수 입력:");
		math = scan.nextInt();
		
		//System.out.printf("%-5d%-5d%-5d", kor, eng, math);
		//결과 1
		//국어 점수 입력:87
		//영어 점수 입력:78
		//수학 점수 입력:90
		//87   78   90  
		
		//3. 연산 
		total = kor + eng + math;
		avg = total/3.0;
		
		//4. 화면 출력
		System.out.printf("%-5s%-5s%-5s%-7s%-5s\n","국어","영어","수학", "총점","평균"); // \n 다음줄에 출력
		System.out.println("국어   영어   수학   총점   평균"); //위와 결과는 똑같이 나옴. 
		
		System.out.printf("%-5d%-5d%-5d%-7d%-5.2f", kor, eng, math,total, avg); // 다음줄에 출력이 없다. 
		// %d(정수 입력), %f(실수), %s(문자열), %c(문자) 잘 구분해서 안 쓰면 오류 남. 
		//결과 2
		
		// println 가장 많이 사용되는 화면 출력 (웹 => 에러 출력(디버깅))
		// printf 소수점 자를 때
		// 웹쪽으로 가면 scanner거의 사용 안 함. 
	}

}
