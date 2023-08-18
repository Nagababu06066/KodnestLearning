import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchase amount :");
		int n=sc.nextInt();
		System.out.println("Enter the Tax rate:");
		double d=sc.nextDouble();
		double p=calculateTotalWithTax(n,d);
		System.out.println("Total cost including tax:");
		System.out.println(n+p);
		

	}
	public static double calculateTotalWithTax(int n,double d) {
		double a;
		return a=n*d;
		
	}

}
