import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String output = reverseString(input);
        
        System.out.println("\n Reversed string : "+output);
         scanner.close();
    }

    public static String reverseString(String input) {
        char[] inputArray = input.toCharArray();
        int length = inputArray.length;
        char[] reversedArray = new char[length];
        
        for (int i = 0; i < length; i++) {
            reversedArray[i] = inputArray[length - 1 - i];
        }
        
        return new String(reversedArray);
    }
}
