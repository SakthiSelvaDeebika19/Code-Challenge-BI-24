
import java.util.*;
public class palindrome_string {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string:");
	String str=sc.nextLine();
	String temp=str;
	
	int len=str.length();
	StringBuilder rev=new StringBuilder();
	for(int i=len;i>0;i--) {
		rev.append(str.charAt(i-1));
		}
		
	
	if(temp.equals(rev.toString())) {
		System.out.println("The given string [" +str+ "] is palindrome");
	}
	else {
		System.out.println("The given string [" +str+ "] is not palindrome");
	}
}
}
