import java.util.Scanner;
public class Average
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter marks in sub1 ");
		float fsub1=s.nextFloat();
		System.out.print("Enter marks in sub2 ");
		float fsub2=s.nextFloat();
		
		float fAverage=(fsub1+fsub2)/2;
		System.out.println("Average is "+fAverage);
				
	}
}





