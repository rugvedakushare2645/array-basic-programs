import java.util.*;

public class ArrList{
	public static void main(String args[]){
		int[] arr = {1,2,3,4,67};

		List<Integer> a1 = new ArrayList<>(arr.length);
		for(int i : arr)
			a1.add(i);
		a1.add(45);

		System.out.println(a1);

	

	// using Arrays.asList
	String[] geeks = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        List<String> a2 =
            new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(a2);
 
        // Adding some more values to the List.
        a2.add("Shashank");
        a2.add("Nishant");
 
        System.out.println("\nArrayList After adding two" +
                           " more Geeks: ");
        System.out.println(a2);



	//using Collections.addAll
	String[] geeks1 = {"Rahul", "Utkarsh", 
                         "Shubham", "Neelam"};
 
        List<String> a3 = new ArrayList<String>();
        Collections.addAll(a3, geeks1);
 
        System.out.println(a3);
	}
}