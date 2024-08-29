package swap;
import java.util.*;
public class swap {
	public static void swap(int n1,int n2) {
		int temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("num1:"+n1);
		System.out.println("num2:"+n2);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers for swapping:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("before Swapping:");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("After Swapping:");
		swap(num1,num2);
		
	}

}
