/*
 * 단일 조건문 : 독립적인 문장 ==> 여러개를 사용시에는 여러개 문장이 수행할 수 있다. 
 */
//조건에 의한 결과를 여러 개 동시에 시행할려면 if문 여러개 사용
//여러 조건이 있는데 그 중 하나만 해당되어서 결과를 내야 할 때 if-else 
public class 조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		if (a%3==0)
		{
			System.out.println(a+"는(은) 3의 배수입니다");
		}
		if (a%5==0)
		{
			System.out.println(a+"는(은) 5의 배수입니다");
		}		
		if (a%7==0)
		{
			System.out.println(a+"는(은) 7의 배수입니다");
		}
	}

}
