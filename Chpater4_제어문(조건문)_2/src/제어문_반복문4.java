//1~100까지 for(int i=1;i<=100;i++) => 총합, 짝수합, 홀수합
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int total = 0, even = 0, odd = 0;
//		
//		for (int i=1; i<=100; i++)
//		{
//			if(i%2==0) // 짝수
//				even += i; // even = even+i
//			else
//				odd+=i;
//			total += i;
//			}
//		System.out.println("1~100까지 총합:"+total);
//		System.out.println("1~100까지 짝수합:"+even);
//		System.out.println("1~100까지 홀수합:"+odd);
			
	
		int total = 0, even = 0, odd = 0;
	
		for (int i=1; i<=100; i++)
		{
			if(i%2==0) // 짝수
			{
				even += i; // even = even+i
				System.out.printf("even = %d, i = %d\n",even,i);
				/*
				 * even = 0
				 * even+= i; => i = 2, even = 2
				 * 				i = 4, even = 6
				 * 				i = 6, even = 12
				 */
			}
			else
			{
				odd+=i;
				System.out.printf("odd = %d, i = %d\n",odd,i);
			}
			total += i;
			}
		System.out.println("1~100까지 총합:"+total);
		System.out.println("1~100까지 짝수합:"+even);
		System.out.println("1~100까지 홀수합:"+odd);
		
		// 3의 배수(a3), 5의 배수(a5), 7의 배수의 합(a7)
		int a3=0, a5=0, a7=0;
		
		for(int i=1; i<=100;i++)
			// else if 쓰면 안 된다. 2개 이상을 실행하기 때문에 숫자들의 공배수가 빠진다. 
			// 15, 35,....else if 쓰면 3의 배수일때 빠져나가서 5의 배수일때 안 더해짐. 
			// if를 써서 독립적으로 수행할 수 있도록 한다. 
		{
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;
		}
		System.out.println("1~100까지 3의 배수합:"+a3);
		System.out.println("1~100까지 5의 배수합:"+a5);
		System.out.println("1~100까지 7의 배수합:"+a7);
				
		

	}

}
