import java.util.Scanner;

public class C1
{				

	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x=input.nextInt();

		if(x>0)
			{
			System.out.println("welcome");
			}
		else
			{
			System.out.println("no welcome");
			}

		for(int i=0 ; i<4 ; i++)
		{ 
			System.out.println("this if for loop");
		}

		while(x<15)
		{
			System.out.println("this is while loop");
			x++;
		}

		input.close();
	}
}
