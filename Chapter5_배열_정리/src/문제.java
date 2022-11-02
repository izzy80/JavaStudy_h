import java.util.Arrays;
import java.util.Scanner;

/*
 * 1. 배열 저장
 * 	  데이터형[] 배열명
 * 	  => 초기화
 * 	  int[] arr={1,2,3,4,5}
 * 	  int[] arr;
 *    arr={1,2,3,4,5}=> 오류
 *    arr=new int[]{1,2,3,4,5}
 *    
 *    int[] arr=new int[10]==>가장 많이 사용
 *    --------클래스도 가능하다(클래스도 변수의 일종 : 사용자 정의)
 * 2. 배열 데이터 출력
 * 3. 배열에 있는 가공하는 문제
 */
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제1
		// 1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장
//		int[] score = {100,90,85};
//		for(int i=0;i<score.length;i++)
//		{
//			//System.out.printf("%d번 학생:%d점\n",i+1,score[i]);
//			System.out.println((i+1)+"번 학생 : "+score[i]);
//		}
//		// 총점을 저장하는 메모리가 필요
//		int sum = 0;
//		for(int i:score)
//		{
//			sum+=i;
//		}
//		//요청한 결과값을 출력
//		System.out.println("총점:"+sum);
//		
//		//@@내 답//
//		for(int i=0;i<score.length;i++)
//		{
//			sum+=score[i];
//		}
//		System.out.println("학생들의 총점:"+sum);
		
		//문제2
//		int[] arr= {50,45,35,12,70};
//		//1 실적 출력
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("사원("+(i+1)+")"+arr[i]);
//			//System.out.printf("사원(%d) %d",i+1,arr[i]);
//		}
//		//총점 평균
//		int sum = 0;
//		for(int i:arr)
//		{
//			sum+=i;
//		}
//		System.out.println("총점:"+sum);
//		System.out.printf("%.2f\n",sum/(double)arr.length);
//		
//		//@@@내답 
//		double avg=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum+=arr[i];
//		}
//		avg = sum/(double)arr.length;
//		System.out.println("총점:"+sum);
//		System.out.println("평균:"+avg);
//		//@@@@
//		
//		//실적 큰 사람, 실적 작은 사원
//		int max = arr[0],sabun1=0;
//		int min = arr[0],sabun2=0;
//				
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//				max = arr[i];
//			if(arr[i]<min)
//				min = arr[i];
//		}
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i] == max)
//			{
//				sabun1=i;
//				break;
//			}
//			if(arr[i] == min)
//			{
//				sabun2=i;
//				break;
//			}
//		}
//		System.out.println("사원("+(sabun1+1)+")"+max);
//		System.out.println("사원("+(sabun2+1)+")"+min);
		
		//문제 3
//		int[] arr = new int[10];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i] = i;
//		}
//		System.out.println(Arrays.toString(arr));
		
		//문제4

//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			sum+=arr[i];
//		}
//		System.out.println("sum="+sum); // 결과 : sum=150
		
		//문제5
//		int[] arr = new int[10];
//		int evenTotal = 0;
//		int oddTotal = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i] = (int)(Math.random()*100)+1;
//			if(arr[i]%2==0)
//				evenTotal+=arr[i];
//			else
//				oddTotal+=arr[i];
//		}
//		System.out.println("짝수 합:"+evenTotal);
//		System.out.println("홀수 합:"+oddTotal);
		
		//답
//		int[] arr = new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i] = (int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		//짝수/홀수합
//		int even=0,odd=0;
//		for(int i:arr)
//		{
//			if(i%2==0)
//				even+=i;
//			else
//				odd+=i;
//		}
//		System.out.println("짝수 합:"+even);
//		System.out.println("홀수 합:"+odd);
		
		//문제6
		/*
		 *  ===============> 같은 용도
		 *  10개(int) 평균(double)  총점(int) 순위(int)
		 */
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		//int[][] 성적=new int[3][5];
		double[] avg = new double[3];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println((i+1)+"번째 국어 입력:");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째 영어 입력:");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 수어 입력:");
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}	
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
					rank[i]++;
			}
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",
					kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
		

		
		
//		int num[] = new int[100];
//		
//		for(int i=0;i<num.length;i++)
//		{
//			num[i] = (int)(Math.random()*10);
//		}
//		System.out.println(Arrays.toString(num));
//		
//		//count
//		for(int i=0;i<num.length;i++)
//		{
//			int count = 0;
//			for(int j=0;j<=9;j++)
//			{
//				if(num[i]==j)
//					count+=i;
//				System.out.printf("%d의 개수:%d\n",j,count);
//			}
//			
//		}
		
		//문제7
//		char alpha[] = {'A','C','D','H','J'};
//		for(int i=0;i<alpha.length;i++)
//		{
//			
//		}


		
		
		
	}

}