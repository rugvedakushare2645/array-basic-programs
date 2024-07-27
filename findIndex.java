import java.util.*;

public class findIndex{
	public static int index1(int arr[], int key){
		if(arr == null)
			return -1;
		int i = 0;
		while(i<arr.length){
			if(arr[i] == key)
				return i;
			else
				i = i+1;
		}	
		return -1;
	}

	public static void main(String args[]){
		int a[] = {2,3,4,5,6};

		System.out.println(index1(a,5));
	}
}