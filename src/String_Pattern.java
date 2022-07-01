import java.util.Scanner;

public class String_Pattern {
	public static void main(String args[])  
	   {  
	      String orig_str= "";   
	      System.out.print("Enter a string: ");
	      Scanner in = new Scanner(System.in); 
	      orig_str = in.nextLine();   
	      int length = orig_str.length();  
	      for(int i = 1; i <= length; i++)
	      {
	    	  for(int j = 0;j<i;j++)
	    	  {
	    		  System.out.print(orig_str.charAt(j));   
	    	  }
	    	  System.out.println("");
	      }
	      
	         
	   }  

}
