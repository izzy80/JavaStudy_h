import java.util.Arrays;

public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//필요한 데이터를 배열에 대입
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//배열의 초기화
		System.out.println(Arrays.toString(arr));
		int max = arr[0];
		int min = arr[0];
		
	}

}
