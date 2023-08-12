import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Integer");
		int n=sc.nextInt();
		System.out.println("Enter the First Integer");
		int m=sc.nextInt();
		swapUsingBitwise(n, m);
		
		

	}
	public static void swapUsingBitwise(int n,int m) {
		n=n^m;
		m=m^n;
		n=n^m;
		System.out.println("After swapping: First = "+n+" Second = "+m);
	}
}
