import java.util.*;								//Generating random numbers
public class RandomNum
{
	public static void main(String args[])
	{
		int counter;
		Random n=new Random();
		
		System.out.println("Random numbers are: ");
		
		for(counter=1; counter<=5; counter++)
		{
			System.out.println(n.nextInt(100));
		}
	
	}
}