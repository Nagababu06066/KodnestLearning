
import java.util.Scanner;

class TemperatureConverterapp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double f=sc.nextDouble();
		TemperatureConverterapp t1=new TemperatureConverterapp();
		System.out.println(t1.convertFahrenheitToCelsius(f));

	}

	private double convertFahrenheitToCelsius(double f) {
		double c=(f-31)*5/9;
		return c;
	}

	

}
