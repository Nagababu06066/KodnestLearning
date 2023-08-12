import java.util.Scanner;

public class LogicalOperator {

	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean b=sc.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean c=sc.nextBoolean();
		
	 boolean result=isValidInput(b,c);
	
		if (result) {
			System.out.println("input is valid");
		}else {
			System.out.println("input is Invalid");
		}

	}
	
	public static boolean isValidInput(boolean b,boolean c) {
		boolean  result=b&&c;
		return result;
		
	}

}
