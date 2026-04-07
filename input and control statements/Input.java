import java.util.Scanner;

public class Input
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);


		System.out.print("Enter the age: ");

		int age=input.nextInt();

		input.nextLine(); //Attention use this line
					

		System.out.print("Enter the name: ");

		String name=input.nextLine();

		System.out.print("Enter the salary: ");

		double salary=input.nextDouble();
		
		

	}

}