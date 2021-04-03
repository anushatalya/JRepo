import java.util.Scanner;

public class FibRec {
	private static int fibRecursive(int n,int n1,int n2,int i) {
		if(i>=n)
			return n2;
		return fibRecursive(n,n2,n1+n2,i+1);
		
	}
	
public static void fibRec(int n) {
	int result=fibRecursive(n,0,1,2);
	System.out.println(n+"th fibonacci number is "+result);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which fibonacci number do you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fibRec(n);
		
	}

}