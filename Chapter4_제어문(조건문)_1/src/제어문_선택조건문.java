/*
 * true/false => 나눠서 처리
 * 짝/홀, 대문자/소문자, 로그인여부, ID중복
 * 
 * 형식)
 * 		
 * -----------------------------------------
 * 		단일 조건문
 * 		if(조건)
 * 		{
 * 			조건 true일때 처리
 * 		}
 * 		if(!조건)
 * 		{
 * 			조건 false일때 처리
 * 		}
 * 
 * 
 * 
 */
import java.util.Scanner;
//Scannner의 단점 ==> 문자 입력이 없다. => 문자열(한글자만 charAt(0))

public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("알파벳 문자 입력:");
		
		char alpha = scan.next().charAt(0); //0:첫번째, 1: 두번째
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha+"는(은) 대문자입니다!");
		if(alpha>='a' && alpha<='z')
			System.out.println(alpha+"는(은) 소문자입니다!");

	}

}
