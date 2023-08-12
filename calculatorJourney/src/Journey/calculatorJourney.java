package Journey;

import java.util.Scanner;

public class calculatorJourney {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double speed=sc.nextDouble();
		double time=sc.nextDouble();
		calculatorJourney j1=new calculatorJourney();
		
		System.out.println(j1.CalculateDistance(speed,time));

	}

	private double CalculateDistance(double speed, double time) {
		
		return speed*time;

	}

}

