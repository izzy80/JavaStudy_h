/*
 * 다중조건문(해당 조건문 1개만 수행) => 141page
 * 1) 형식
 * 		if(조건문)
 * 		{
 * 			조건 true일때만 수행하는 문장 ↗ 종료
 * 
 * 					↓ false
 * 		}
 * 		else if (조건문)
 * 		{
 * 			조건 true일때만 수행하는 문장 ↗ 종료
 * 
 * 					↓ false
 * 		}
 * 		...
 * 		...
 * 		else
 * 		{
 * 			//생략이 가능
 * 			해당 조건이 없는 모든 내용을 수행
 * 		}
 * 		1~100까지의 정수중 3의 배수, 5의 배수, 7의 배수 출력
 * 					------------------------- 단일 조건문 (중복으로 수행해야하는 부분이 있음)
 * 					15 -> 3의 배수, 5의 배수라고 나와야함. 경우의 수가 2개 나와야함.
 * 		여러개 출력 -> 단일
 * 		한개씩만 출력 -> 다중 
 */
public class 다중_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = (int)(Math.random()*101); //0~100사이
		//				----------------- 0.0~100.0 ==> 0~100
		int eng =(int)(Math.random()*101);
		int math =(int)(Math.random()*101);
		
		int avg=(kor+eng+math)/3;
		
		char hakjum='A';
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum = 'F';
		//if 여러개 사용 ==> 여러번 수행(단일 조건문 여러개), 한번만 수행(다중 조건문)
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("학점:"+hakjum);
				

	}

}
