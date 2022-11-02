/*
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
 */
import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		int c = (int)(Math.random()*100)+1;
		
		System.out.println("a="+a+",b="+b+",c="+c);
		
		int max = a;
		if (max<b) max = b;
		if (max<c) max = c;
		System.out.println("최대값:"+max);
		
		int min = a;
		if (min>b) min = b;
		if (min>c) min = c;
		System.out.println("최소값:"+min);
		
		int total = a+b+c;
		double avg = total/3.0;
		
		System.out.println("총합:"+total);
		System.out.println("평균:%.2f",avg);
//		Scanner scan = new Scanner(System.in);
//		System.out.println("세 개의 정수 입력 80 80 80:");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		
//		int max = 0; //-> 가장 작은 값
//		if (max < num1)
//			max = num1;
//		if (max < num2)
//			max = num2;
//		if (max < num3)
//			max = num3;
//		
//		int min = 100; //-> 가장 큰 값
//		if (min > num1)
//			min = num1;
//		if (min > num2)
//			min = num2;
//		if (min > num3)
//			min = num3;
//		
//		int total = num1 + num2 + num3;
//		double avg = total/(3.0);
//			
	}

}
