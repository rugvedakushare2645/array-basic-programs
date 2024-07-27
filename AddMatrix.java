public class AddMatrix{
	public static void main(String[] args){
		
		int size = 4;
		int A[][]={{1,1,1,1},
			   {2,2,2,2},
			   {3,3,3,3},
			   {4,4,4,4}
			};
		printMatrix(A,size,size);
		int B[][]={{1,1,1,1},
			   {2,2,2,2},
			   {3,3,3,3},
			   {4,4,4,4}
			};
		printMatrix(B,size,size);

		int i , j;
		int C[][] = new int[size][size];
		for( i =0; i<size;i++){
			for( j=0; j<size; j++){
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		printMatrix(C,size,size);
	}

	public static void printMatrix(int M[][], int rowSize, int colSize){
		for(int i = 0; i< rowSize; i++){
			for(int j = 0; j< colSize; j++){
				System.out.print(M[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
}