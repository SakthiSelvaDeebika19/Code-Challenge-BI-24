import java.util.Scanner;
public class large_small {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elments:");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("Enter array elements:");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("The array elements are:");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println(" ");
	int min=a[0];
	int max=a[0];
	for(int i=0;i<n;i++) {
		if(a[i]<min) {
			min=a[i];
		}
		else if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("The smallest element in array:"+min);
	System.out.println("The largest element in array:"+max);
	
}
} 

