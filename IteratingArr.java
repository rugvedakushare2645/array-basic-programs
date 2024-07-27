import java.util.*;

public class IteratingArr{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter the number of 2D arrays: ");
		int x = scanner.nextInt();
		System.out.println("ENter the number of rows in 2D array: ");
		int y = scanner.nextInt();
		System.out.println("ENter the number of columns in 2D array: ");
		int z = scanner.nextInt();

		int[][][] arr = new int[x][y][z];

		for(int i=0; i<x;i++){
			for(int j=0 ;j<y;j++){
				for(int k=0;k<z;k++){
					System.out.println("Enter the element at ["+i+"]["+j+"]["+k+"]:");
					arr[i][j][k] = scanner.nextInt();
				}
			}
		}

		System.out.println("The 3D array is:");

		for(int i=0; i<x;i++){
			for(int j=0 ;j<y;j++){
				for(int k=0;k<z;k++){
					System.out.println(arr[i][j][k]+" ");
				}
			}System.out.println();
		}
		scanner.close();

	}
}