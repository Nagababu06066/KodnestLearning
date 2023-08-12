import java.util.Scanner;

public class BitwiseBitCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		countSetBits(n,count);
		System.out.println(countSetBits(n,count));
	}
	public static int countSetBits(int n,int count) {
		while(n>0) {
			count +=n&1;
			n>>=1;
		}
		return count;
		
	}
}
