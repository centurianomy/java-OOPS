									//Fibonacci
import java.util.Scanner;
public class Fibo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no of digits of Fibonacci series: ");
		int n=s.nextInt();
		
		System.out.println();

		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0; i<n-2; i++)
		{
			c=(a+b);
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}
}