import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade, score;
		grade = (int)(Math.random()*4)+1;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력(0~100):");
		score = scan.nextInt();
		//if (score<0 || score >100){} else {}
		if (score>=0 && score <=100)//정상 입력
		{
			if(grade==4)
			{
				if(grade>=70)
					System.out.println("합격==>"+grade);
				else
					System.out.println("불합격"+grade);
			}
			else //1,2,3
			{
				if(score>=60)
					System.out.println("합격==>"+grade);
				else
					System.out.println("불합격 ==>"+grade);
			}
		}
		else
		{
			System.out.println("잘못된 입력입니다!!");
		}
//		
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("점수 입력 80 80 80 80: ");
//		int first = scan.nextInt();
//		int second = scan.nextInt();
//		int third = scan.nextInt();
//		int fourth = scan.nextInt();
//		
//		int sum = first + second + third + fourth
//		
//		if (avg<0 || avg>100)
//		{
//			경고
//		}
//		else
//		{
//			if(grade ==4)
//			{
//				if(score>70)
//				{
//					
//				}
//				else
//				{
//					
//				}
//			else
//			{
//				
//			}
//			}
//		}
//		if (fourth >= 70)
//			System.out.println("합격입니다.");
//		if (first >=60)
//			System.out.println("합격입니다.");
//		if (second >=60)
//			System.out.println("합격입니다.");
//		if (third >=60)
//			System.out.println("합격입니다.");
//		if (score < 0 && score > 400 )
//			System.out.println("경고문구.");
//		
//		

		
		
	}

}
