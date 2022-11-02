import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for(초기값; 범위; 증가값)
		 * 		2	 100	  2
		 * ==> 합을 구해서 출력하는 변수
		 * 
		 * 1. 루프변수 ==> i,j 
		 *
		 * 2. 누적변수
		 * 3. 프레그변수
		 */
		//문제 8) 2+4+5+...100까지의 정수의 합을 구하고 출려가하라(for 사용)
//		int even = 0;
//		
//		for(int i=1;i<=100;i++)
//			{
//				if(i%2==0)
//					even+=i;
//			}
//		System.out.println("2+4+...100의 합:"+even);
//
		
		// 문제 9) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라
//		for (int i=5; i<=50;i+=5)
//			System.out.print(i+" ");
		
		//문제 10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
//		for (char c='B';c<='N';c+=2)
//				System.out.print(c+" ");
		
		//문제 11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
		//갈색 = 지역변수, 파랑색 ==> 멤버변수
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수 입력:");
//		int n = scan.nextInt();
//		
//		int total = 0; 
//		for (int i=1; i<=n;i++) ==> 누적 
//		{
//			total += i;
//		}
//		System.out.printf("1~%d까지의 합:%d",num,total);
		
		//random이용(강사쌤 답)
//		int n = (int)(Math.random()*100)+1;//범위
//		int sum=0;//합
//		System.out.println("범위:"+n);
//		for(int i=1;i<=n;i++)
//		{
//			sum+=i;
//		}
//		System.out.println("1~"+n+"까지의 합:"+sum);
		
		//문제 12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
//		for(int i=1;i<=30;i++)
//		{
//			if(i%2==0)
//			{
//				System.out.printf("%5d",i);//출력
//				if(i%3==0)//다음줄에 출력 
				// 6,12,18...이 3으로 나누면 0으로 되어서, 그 부분이 되면 다음줄에 출력하라는 소리
//					System.out.println(); // 위치도 중요. if위로 올리면 6도 내려버림
//			}
//				
//		}
		//문제13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
//		int sum = 0;
//		
//		for(int i=1;i<=10;i++)
//		{
//			if(i%2==0)
//				 sum-=i;
//			else
//				sum += i;
//		}
//		System.out.println("1-2+3..-10까지의 합:"+sum);
		
//		문제 14) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
//		for(int i=1;i<=10;i++)
//		{
//			//if(!(i%3=0)) //i%3!= ==>제외
//			if (i%3==0)
//				continue; -> 3의 배수 제외. 특정부분 제외할 때 많이 쓰임
//			System.out.print(" "+i);	
//		}
//		
		//문제 15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
		// 십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라. ==> if~else 문장
//		Scanner scan = new Scanner(System.in);
//		System.out.println("2자리수 정수 입력(10~99):");
//		int num = scan.nextInt();
//		if(num%11==0)
//			System.out.println("10의 자리와 1의 자리가 같습니다. ");
//		else
//			System.out.println("10의 자리와 1의 자리가 같지 않습니다. ");
// 강사쌤 답
//		int a = num/10;
//		int b = num%10;
//		if(a==b)
//			System.out.println("10의 자리와 1의 자리가 같습니다.");
//		else
//		System.out.println("10의 자리와 1의 자리가 같지 않습니다. ");
		
		//문제 16)숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("달을 입력하세요(1~12):");
//		int season = scan.nextInt();
//		//if~else문
//		if(season == 3 || season == 4 || season == 5)
//			System.out.println("봄");
//		else if(season == 6 || season == 7 || season == 8)
//			System.out.println("여름");
//		else if(season == 9 || season == 10 || season == 11)
//			System.out.println("가을");
//		else
//			System.out.println("겨울");
			
		
		//switch문
//		switch(season)
//		{
//			case 3: case 4: case 5:
//				System.out.println("봄");
//				break;
//			case 6: case 7: case 8:
//				System.out.println("여름");
//				break;
//			case 9: case 10: case 11:
//				System.out.println("가을");
//				break;
//			case 12: case 1: case 2:
//				System.out.println("겨울");
//				break;
//		}
		//강사쌤 답
		// if문 => 범위가 주어질때
//		int season = scan.nextInt();
//		
//		if (month>=3 && month <=5)
//			System.out.println("봄");
//		else if(month>=6 && month<=8)
//			System.out.println("여름");
//		else if(month>=9 && month<=11)
//			System.out.println("가을");
//		else if(month==12 || month==1 || month==2)
//			System.out.println("겨울");
		
		// swtich => 한개씩 선택될때. 범위가 너무 많으면 case문 안 쓰는게 좋다. 
		/*
		 * switch(문자, 문자열, 정수)
		 * {
		 * 	case '', "", 1:
		 * 		출력;
		 * 		break;
		 * 	default: 생략
		 * }
		 * case 라벨: → 라벨은 중복 사용이 불가능
		 * 			 → 라벨은 실수는 사용할 수 없다.  ==> 게임에서 많이 쓰임. 메뉴 선택시.
		 */
//		switch(month)
//		{
//		case 1:case 2: case 12:
//			System.out.println("겨울");
//			break;
//		case 3:case 4: case 5:
//			System.out.println("봄");
//			break;
//		case 6:case 7: case 8:
//			System.out.println("여름");
//			break;
//		default:
//			System.out.println("가을");
			
			
		}
		
			
			
		
		
		
		
		
		
	}

}
