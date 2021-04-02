
public class maxElementArray {
	
	public static int maxElement(int[] arr, int n)
	{
		/* int first=arr[0]
		
		 * for(int i=1;i<arr.length;i++){
		 * if(first<arr[i])
		 * 	first=arr[i]
		 *
		 *   return arr[i]
		 * 
		 * 
		 * 
		 * Problems:
		 * i 
		 * first - result 
		 *
		 */
		
		if(n == 1) {
			return arr[0];
		}
		
		int val = maxElement(arr, n-1);
		//System.out.println("val = " + val + " arr[" + (n-1) + "] = " + arr[n-1]);
		return Math.max(val, arr[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10, 3, 5, 8, 15, 38, 27};
		
		printArray.printArrayRec(arr);
		
		int max = maxElement(arr, arr.length);
		System.out.println("Max = " + max);
	}

}
