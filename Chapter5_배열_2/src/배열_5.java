import java.util.Arrays;

// 배열 복사
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {100,200,300,400,500};
		int[] copy=new int[arr.length*2];
		
		System.arraycopy(arr, 0, copy, 3, 2);
		// arr의 인덱스, copy 인덱스
		System.out.println("arr="+Arrays.toString(arr));
		System.out.println("copy="+Arrays.toString(copy));
	}

}
