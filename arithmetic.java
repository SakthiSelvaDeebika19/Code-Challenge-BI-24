import java.util.*;
public class arithmetic {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition  2.Subtraction  3.Multiplication  4.Division");
		int op=sc.nextInt();
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		switch(op) {
		case 1:
			int c=a+b;
			System.out.println("Addition="+c);
			break;
		case 2:
			int d=a-b;
			System.out.println("Subtraction="+d);
			break;
		case 3:
			int e=a*b;
			System.out.println("Multiplication="+e);
			break;
		case 4:
			int f=a/b;
			System.out.println("Division="+f);
			break;
		default:
			System.out.println("Please enter valid operation to perform");
			
		}
	}
}