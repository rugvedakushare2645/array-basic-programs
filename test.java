import java.util.Arrays;

public class test{
	public static void main(String[] args){
		int[] arr = {50, 67,88,77,-11};
		
		System.out.println("Original Array: "+ Arrays.toString(arr));
		System.out.println("Result: "+ testArr(arr));
	}

	public static boolean testArr(int[] num){
		for(int i:num){
			if(i==0||i==-1)
				return false;
		}
		return true;
	}
}