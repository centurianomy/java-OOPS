import java.util.Scanner;

public class Sum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a=s.nextInt();
		System.out.print("Enter b: ");
		int b=s.nextInt();
		
		int sum=a+b;
		System.out.println("The sum of a and b is "+sum);
	}

}

