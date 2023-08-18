
public class labelWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
babu:while(i<=5) {
	int m=1;
	naga:while(m<=5) {
		System.out.print("*");
		m++;
		break babu;
		
	}
	System.out.println();
	i++;
}
	}

}
