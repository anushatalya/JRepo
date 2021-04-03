import java.util.Scanner;

public class FibIter {
	public static int fibIteration(int n) {
		int n1=0,n2=1,n3=0;
		for(int i=2;i<n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Which fibonacci number do you want");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=fibIteration(n);
		System.out.println(n+"th fibonacci number is "+result);
	}

}