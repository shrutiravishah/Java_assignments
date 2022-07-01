import java.util.Scanner;

public class Factorial 
{
	public static void main(String args[])  
	   {  
	      int number, fact = 1;  
	      System.out.print("Enter a number: ");
	      Scanner s = new Scanner(System.in); 
	      number = s.nextInt();   
	      for(int i =1 ; i<=number; i++)
	      {
	    	  fact = fact*i;
	      }
	      
	    
	      System.out.println("Factorial of "+ number +" is : " + fact);      
	   }  
	

}
