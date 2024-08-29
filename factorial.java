
import java.util.*;
public class factorial {
	
	public int factorial(int n) {
		int fact=1;
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static void main(String[] args) {
		factorial fact=new factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		System.out.println(fact.factorial(n));
	}

}
