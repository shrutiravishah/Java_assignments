
public class fibonacci {

	public static void main(String[] args) {
		int number = 10, n1 = 0, n2 = 1, i=0, fibo = 0;
		System.out.println(" "+n1);
		System.out.println(" "+n2);
		for(i=2; i<number;i++)
		{
			fibo = n1 + n2;
			System.out.println(" " + fibo);
			n1 = n2;
			n2 = fibo;
		}
	}

}
