import java.util.Arrays;
import java.util.Scanner;

public class practical_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the task you want to perform:");
    
        System.out.println("1. Printing the length of string");
        System.out.println("2. Printing the lowercase of string");
        System.out.println("3. Printing the uppercase of string");
        System.out.println("4. Printing the reverse of string");
        System.out.println("5. Printing the sorted string"); 
        
        System.out.println("Enter the number of the task to perform:");
        int option = sc.nextInt();

        switch(option) {
            case 1: {
                int length = str.length();
                System.out.println("Length of string: " + length);
                break;
            }
            case 2: {
                String str1 = str.toLowerCase();
                System.out.println("Lowercase of string: " + str1);
                break;
            }
            case 3: {
                String str2 = str.toUpperCase();
                System.out.println("Uppercase of string: " + str2);
                break;
            }
            case 4: {
                String str3 = new StringBuilder(str).reverse().toString();
                System.out.println("Reversed string: " + str3);
                break;
            }
            case 5: {
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);
                String str4 = new String(charArray);
                System.out.println("Sorted string: " + str4);
                break;
            }
            default: {
                System.out.println("Invalid option");
                break;
            }
        }

    
    }
}
