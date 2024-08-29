
import java.util.Scanner;
public class bubble {
public static void bubble_sort(int[] arr,int n) {
	int temp=0;
	for(int i=0;i<n;i++) {
		for(int j=1;j<n-i;j++) {
			if(arr[j-1]>arr[j]) {
				temp=arr[j-1];
				arr[j-1]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
}
	
public static void main(String[] args) {
	System.out.println("Enter number of Elements in array:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	bubble_sort(a,n);
	System.out.println("The sorted array is:");
	for(int i=0;i<n;i++)
		System.out.println(a[i]);
}}