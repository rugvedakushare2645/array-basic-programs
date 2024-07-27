import java.util.*;
import java.io.*;

public class EqualArr{
	public static void main(String[] args){
		int a1[] = {3,3,2,2,1};
		int a2[] = {2,2,3,1,3};

		if(areEqual(a1,a2))
			System.out.println("Yes");
		else
			System.out.println("no");
	}

	public static boolean areEqual(int arr1[], int arr2[]){
		int M = arr1.length;
		int N = arr2.length;

		if(M!=N)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i = 0; i< M;i++){
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
}