import java.util.*;
//using ArrayList
public class findIndex1{
	public static void main(String args[]){
		int a[] = {2,3,4,5,6};
		System.out.println(Index(a,5));
	}

	public static int Index(int arr[], int key){
		ArrayList<Integer> clist = new ArrayList<>();
		for(int i: arr)
			clist.add(i);
		return clist.indexOf(key);
	}
}