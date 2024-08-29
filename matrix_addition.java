
import java.util.*;
public class matrix_addition {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter no.of rows for matrix 1:");
	int r1=sc.nextInt();
	System.out.println("Enter no.of columns for matrix 1:");
	int c1=sc.nextInt();
	
	System.out.println("Enter no.of rows for matrix 2:");
	int r2=sc.nextInt();
	System.out.println("Enter no.of columns for matrix 2:");
	int c2=sc.nextInt();
	
	if(r1==r2 && c1==c2) {
		
	
	int a[][]= new int[r1][c1];
	System.out.println("Enter 1st matrix");
	
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c1;j++) {
			a[i][j]=sc.nextInt();
		}
		System.out.println(" ");
	}
	
	System.out.println(" 1st matrix");
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c1;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	int b[][]= new int[r2][c2];
	System.out.println("Enter 2nd matrix");
	for(int i=0;i<r2;i++) {
		for(int j=0;j<c2;j++) {
			b[i][j]=sc.nextInt();
		}
		System.out.println(" ");
	}
	System.out.println(" 2nd matrix");
	for(int i=0;i<r2;i++) {
		for(int j=0;j<c2;j++) {
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	
	int c[][]=new int[r1][c1];
	
	System.out.println("Resultant matrix:");
	
   for(int i=0;i<r1;i++) {
	   for(int j=0;j<c1;j++) {
		   c[i][j]=a[i][j]+b[i][j];
		   System.out.print(c[i][j]);
	   }
	   System.out.println();
   }
	}
	else {
		System.out.println("Enter equal number of rows and columns");
	}
	
}
}
//multiplication

package matrix_multi;

import java.util.Scanner;

public class matrix_multi {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no.of rows for matrix 1:");
		int r1=sc.nextInt();
		System.out.println("Enter no.of columns for matrix 1:");
		int c1=sc.nextInt();
		
		System.out.println("Enter no.of rows for matrix 2:");
		int r2=sc.nextInt();
		System.out.println("Enter no.of columns for matrix 2:");
		int c2=sc.nextInt();
		
		if(c1==r2) {
			
		
		int a[][]= new int[r1][c1];
		System.out.println("Enter 1st matrix");
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				a[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}
		
		System.out.println(" 1st matrix");
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int b[][]= new int[r2][c2];
		System.out.println("Enter 2nd matrix");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				b[i][j]=sc.nextInt();
			}
			System.out.println(" ");
		}
		System.out.println(" 2nd matrix");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int c[][]=new int[r1][c2];
		
		
		
	   for(int i=0;i<r1;i++) {
		   for(int j=0;j<c2;j++) {
			   c[i][j]=0;
			   for(int k=0;k<r2;k++) {
				   c[i][j] += (a[i][k]*b[k][j]);
			   }
			   
		   }
		   
	   }
	   System.out.println("Resultant matrix:");
	   for(int i=0;i<r1;i++) {
		   for(int j=0;j<c2;j++) {
			   System.out.print(c[i][j]);
		   }
		   System.out.println();
	   }
		}
		else {
			System.out.println("Enter equal number of rows and columns");
		}
		
	}
}