import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String args[])  
	   {  
	      int number, rem,sum =0;  
	      System.out.print("Enter a number: ");
	      Scanner s = new Scanner(System.in); 
	      number = s.nextInt();   
	      
	      System.out.println("Originl number is : " + number);
	      while(number>0)
	      {
	    	rem = number%10;
	    	sum = (sum*10)+rem;
	    	number = number/10;
	      }
	      System.out.println("Reverse number is : " + sum);      
	   }  
}
