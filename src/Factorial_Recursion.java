import java.util.Scanner;

public class Factorial_Recursion{
	public static void main(String args[]){  
		int number, fact = 1;  
		System.out.print("Enter a number: ");
		Scanner s = new Scanner(System.in); 
		number = s.nextInt();   
		fact = factorial(number);
		System.out.println("Factorial of "+ number +" is : " + fact);      
	}  
	static int factorial(int num){
		if(num == 0)
			return 1;
		else
			return (num * factorial(num-1));
	}
}

