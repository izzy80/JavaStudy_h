/*
 * 변수/배열/클래스==> 선언, 초기화
 * 변수
 * 	int a=10;
 * 	데이터형[] 배열명={10,20,30,40,50}
 * 	데이터형[] 배열명=new 데이터형[갯수];
 * 
 * 	데이터형 배열명[] = {10,20,30,40,50}
 * 	데이터형 배열명[] = new 데이터형[갯수]
 * 
 * 	클래스 => A
 * 	A a = new A()
 * 		  --- 메모리 위치 지정(주소값을 a에 저장)
 * 	-----------------------------------참조형 ==> new(동적 메모리 할당)
 * 
 * 1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
 * 	char[] c=new char[10];
 * 2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
 * 	int[] n={0,1,2,3,4,5}
 * 3) '일', '월', '화','수','목','금','토'로 초기화된 배열day를 선언하라. 
 * 	char[] day={'일', '월', '화','수','목','금','토'};
 * 4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라. 
 *	boolean[] bool = {true, false, false, true};
 */
import java.util.Arrays;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@@@@@@ 달력 @@@@@@@@//
//		Scanner scan = new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int year=scan.nextInt();
//		
//		System.out.println("월 입력:");
//		int month=scan.nextInt();
//		
//		System.out.println(year+"년도"+month+"월");
//		
//		System.out.println("\n");
//		char[] strWeek= {'일', '월', '화','수','목','금','토'};
//		for(char c:strWeek)
//		{
//			System.out.print(c+"\t");
//		}
//		
//		int[] lastday= {31,24,31,30,31,30,31,31,30,31,30,31};
////		int sum=0;
////		for(int i:lastday)
////		{
////			sum+=1;
////		}
////		System.out.println(sum);
//		//1년도 1월 1일 ==> 전년도까지의 합(날수)
//		int total=(year-1)*365
//				+(year-1)/4	//366
//				-(year-1)/100	//제외
//				+(year-1)/400;	//윤년
//		//전달
//		if((year%4==0 && year%100!=0)||(year%400==0))
//			lastday[1]=29;
//		else
//			lastday[1]=28;
//		
//		for(int i=0;i<month-1;i++)
//			total+=lastday[i];
//		//+1 ==> 10월 1일의 요일을 확인
//		total++;
//		int week=total%7;
//		System.out.println(strWeek[week]);
//		
//		System.out.println();
//		for(int i=1;i<=lastday[month-1];i++)
//		{
//			if(i==1)
//			{
//				for(int j=0;j<week;j++)
//				{
//					System.out.print("\t");
//				}
//			}
//			System.out.printf("%2d\t",i);
//			week++;
//			if(week>6)
//			{
//				week=0;
//				System.out.println();
//			}
//		}
//		
//		
		
		
		
		//@@@@@@@@@@@@@@@@@@@@@@//
		//문제3. 
//		char[] alpha = {'a','b','c','d'};
//		for(int i=0;i<alpha.length;i++)
//		{
//			System.out.println(alpha[i]+" ");
//		}
//		System.out.println();
//		for(char c:alpha)
//		{
//			System.out.print(c+" ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(alpha));
		
		
		
		//문제4.
		//10 저장하는 공간
//		int[] arr=new int[10];
//		//초기화
//		for(int i=0;i<arr.length;i++) 
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		//화면 출력
//		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<arr.length;i++) //인덱스 이용해서 값을 얻어온다. 
//		{	
//			if(i%3==0)
//			System.out.println(i+" ");
//		}
		
//		for(int i:arr) // 실제 저장된 값을 얻어온다. 
//		{
//			if(i%3==0)
//				System.out.println(i+" ");
//		}

		
		
//		//배열 문제5
//		//정수를 10개 저장하는 배열을 만들고
//		int[] arr=new int[10];
//		//1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10)+1;
//		}
//		//배열에 든 숫자출력
//		System.out.println(Arrays.toString(arr));
//		//평균을 출력
//		int sum=0;
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.printf("평균:%.2f\n",sum/(double)arr.length);
		
			
		//배열 문제6
		//데이터 저장
//		int[] num = {94,85,95,88,90};
//		int max = num[0];
//		int min = num[0];
//		
//		System.out.println(Arrays.toString(num));
//		
//		for(int i:num)
//		{
//			if(max<i)
//				max=i;
//			if(min>i)
//				min=i;
//		}
//		
//		System.out.println("최대값:"+max);
//		System.out.println("최소값:"+min);
		
		//배열 문제 7
		int[] arr= {10,20,30,50,3,60,-3};
		System.out.println(arr[1]);
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==60)
			{
				break;
			}
		}
		System.out.println("인덱스는 "+i);
		
		
		
		
		
		
		
			
			
			
			
			
			
//		Scanner scan = new Scanner(System.in);
//		
//		int arr[] = new int[10];
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("양의 정수 10개 입력>>");
//			arr[i] = scan.nextInt();
//		}
//		
//		for(int i=0;i<10;i++)
//		{
//			if(arr[i]%3==0)
//				System.out.print(arr[i]+" ");
//
//		}
		// 5. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라. 
//		int arr[] = new int[10];
//		int total = 0;
//		double avg = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i] = (int)(Math.random()*10)+1;
//			System.out.print(arr[i]+" ");
//			total += arr[i];
//			avg = total/(double)arr.length;
//		}
//		System.out.println("\n총점="+total);
//		System.out.println("평균="+avg);
		
		//6. int[] num = { 94, 85, 95, 88, 90 };
		// 다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
		
//		int[] num= { 94, 85, 95, 88, 90 };
//		int max=0,min=100;
//		
//		for(int i=0;i<num.length;i++)
//		{
//			if(max<num[i])
//				max=num[i];
//		}
//		for(int i=0;i<num.length;i++)
//		{
//			if(min>num[i])
//				min=num[i];
//		}
//		System.out.println("max="+max);
//		System.out.println("min="+min);
		
		
		//8. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.
//		int[] arr = {10,20,30,50,3,60,-3};
//		System.out.println("arr[1]="+arr[1]);
		
		//9.  arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 
//		int[] arr= {10,20,30,50,3,60,-3};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==60)
//				System.out.println("값이 60인 곳의 인덱스="+i);
//		}





	}

}
