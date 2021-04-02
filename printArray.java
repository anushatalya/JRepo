
public class printArray {
	
	private static void printArrayRecursively2(int[] arr, int i, int n) {
		
		if(i<n) {
			System.out.print(arr[i] + " ");
			printArrayRecursively2(arr, i+1, n);
		}
		
	}
	
	private static void printArrayRecursively(int[] arr, int i, int n) {
		/*
		 * for(int i=0; i<array.length; i++)
		 *  SOP(array[i]);
		 */
		if(i >= n)
			return;
		
		System.out.print(arr[i] + " ");
		printArrayRecursively(arr, i+1, n);
	}

	public static void printArrayRec(int[] array) {
		System.out.println("The contents of Array:");
		printArrayRecursively2(array, 0, array.length);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,2,13,11,15};
	
		printArrayRec(array);

	}

}
