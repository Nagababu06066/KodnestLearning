package trouble;

import java.util.Scanner;

public class doubleTrouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		System.out.println(doubleTheNumber(num1));

	}
	public static int doubleTheNumber(int num) {
		
		return num*2;
		
	}

}
