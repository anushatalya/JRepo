
public class revArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7};
		System.out.println("Content of array before reversal");
		System.out.print("{");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
		System.out.println("}");
		int temp;
		int length=array.length-1;
		for(int index=0; index<array.length/2;index++)
		{
			temp=array[index];
			array[index]=array[length];
			array[length]=temp;
			length--;
		}
		
		System.out.println("Content of array after reversal");
		System.out.print("{");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i] +" ");
		}
		System.out.println("}");
	}

}
