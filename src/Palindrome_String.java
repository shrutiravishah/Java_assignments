import java.util.Scanner;

public class Palindrome_String 
{
	public static void main(String args[])  
	   {  
	      String orig_str, rev_str = "";   
	      System.out.print("Enter a string: ");
	      Scanner in = new Scanner(System.in); 
	      orig_str = in.nextLine();   
	      int length = orig_str.length();  
	      System.out.println("Originl String is : " + orig_str);
	      for ( int i = length - 1; i >= 0; i-- )  
	         rev_str = rev_str + orig_str.charAt(i);
	      System.out.println("Reverse String is : " + rev_str);
	      if (orig_str.equalsIgnoreCase(rev_str))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");   
	   }  

}
