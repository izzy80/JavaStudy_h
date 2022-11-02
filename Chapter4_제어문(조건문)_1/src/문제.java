/*
 * 
 */
import java.util.Scanner;
public class 문제 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1. 정수 한 개를 입력 받아서, 그 수가 50이상의 수인지 50미만의 수인지 판단
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = scan.nextInt();
		
		if (num>=50)
		{
			System.out.println(num+"은(는) 50 이상입니다!!");
		}
		else
		{
			System.out.println(num+"은(는) 50미만입니다!!");
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num1 = scan.nextInt();
		
		if (num1>=50)
			System.out.println("50 이상입니다.");
		else
			System.out.println("50 미만입니다.");

	}

}
