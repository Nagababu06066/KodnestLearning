import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Converstion Tool");
		System.out.println("Select a option :");
		System.out.println("1.Convert Celsius to Fahrenheit");
		System.out.println("2.Convert Fahrenheit to Celsius");
		
		System.out.println("Enter your choice:");
		int n=sc.nextInt();
		
		if(n==1) {
			System.out.println("Enter the Temperature");
			double c=sc.nextDouble();
			System.out.println("Enter the temperature in Celsius:"+c);
			double celsius=celsiusToFahrenheit(c);
			System.out.println(c+".*C is equivalent to"+celsius+"0*F");
		}else {
			System.out.println("Enter the Temperature");
			double F=sc.nextDouble();
			System.out.println("Enter the temperature in Fahrenheit:"+F);
			double Fahrenheit=FahrenheitToCelsius(F);
			System.out.println(F+".0F is equivalent to"+Fahrenheit+"0*C");
		}
	
	}
	public static double celsiusToFahrenheit(double c) {
		double celsius=((c * 9/5) + 32);
		return celsius;
		
	
}
	public static double FahrenheitToCelsius(double F) {
		double Fahrenheit =(F - 32) * 5/9;
		return Fahrenheit;
		
	
}
}
