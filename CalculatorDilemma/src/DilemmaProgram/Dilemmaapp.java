package DilemmaProgram;



public class Dilemmaapp{
	public void calculator(int n, int m, String operation) {
		
		switch (operation) {
	    case "add":
	        int result = n + m;
	        System.out.println(result);
	        break;
	    case "sub":
	       int result1 = n - m;
	       System.out.println(n+"-"+m+"="+result1);
	        break;
	    case "mul":
	       int result2 = n * m;
	       System.out.println(result2);
	        break;
	    case "div":
	        int result3 = n / m;
	        System.out.println(result3);
	        break;
	    default:
	        System.out.println("invalid operation");
	}
		
	}


	
	
}

