/*
 * 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자
 * 
 * ==> if~else
 * 
 */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 한 개를 입력 받아서, 그 수가 3의 배수인지 판단해보자. 
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num2 = scan.nextInt();
		
		if (num2%3==0)
			System.out.println("3의 배수입니다.");
		if (num2%3!=0)
			System.out.println("3의 배수가 아닙니다.");
			
	}

}
