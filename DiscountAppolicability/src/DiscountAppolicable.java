import java.util.Scanner;

public class DiscountAppolicable {
	public static void Discount(double purchaseAmount) {
		if(purchaseAmount>=100) {
			System.out.println("Discount Appilcable");
		}
		else {
			System.out.println("Not elgible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount:");
		double purchaseAmount=sc.nextDouble();
		Discount(purchaseAmount);
		System.out.println();

	}

}
