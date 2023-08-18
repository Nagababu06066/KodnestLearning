package DilemmaProgram;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CalculatorDilemma {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	
	System.out.println("Enter ur Operation eg: add,sub,mul,div");
	
	String operation=sc.next();
	Dilemmaapp d=new Dilemmaapp();
	d.calculator(n,m,operation);

	}

	
}

