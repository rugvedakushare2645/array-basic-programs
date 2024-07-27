import java.io.*;

public class sumOfArrays{
	public static void main(String args[]){
		int sum = 0;
		int arr[] = {2,3,4,5};
		for(int i=0; i<arr.length ;i++){
			sum = sum + arr[i]; 
		}
		System.out.println("Sum of Arrays is:" +sum);
	}
}