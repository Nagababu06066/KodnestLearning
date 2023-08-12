

		import java.util.Scanner;

		public class Arithmetic {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int num1=sc.nextInt();
				int num2=sc.nextInt();
				int x=sc.nextInt();
				int y=sc.nextInt();
				double n=sc.nextInt();
				double g=sc.nextInt();
				int a=sc.nextInt();
				int t=sc.nextInt();
				System.out.println(subtractNumbers(num1,num2));
				System.out.println(multiplyNumbers(x,y));
				System.out.println(divideNumbers(n,g));
				System.out.println(findRemainder(a,t));

			}
			public static int subtractNumbers(int num1,int num2){
				return num1-num2;
				
			}
		public static int multiplyNumbers(int x,int y){
			return x*y;
				
			}
		public static double divideNumbers(double n,double g){
			return n/g;
			
		}
		public static int findRemainder(int a,int t){
			return a%t;
			
		}


		

	}

