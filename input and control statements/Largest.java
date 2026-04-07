							//largest of three numbers
import java.util.Scanner;
public class Largest
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a ");
		int a=s.nextInt();
		
		System.out.print("Enter b ");
		int b=s.nextInt();

		System.out.print("Enter c ");
		int c=s.nextInt();
	
		if(a>b && a>c)
		{
		System.out.println("a is greatest");
		}

		else if(b>a && b>c)
		{
		System.out.println("b is greatest");
		}

		else
		{
		System.out.println("c is greatest");
		}
		
	}

}