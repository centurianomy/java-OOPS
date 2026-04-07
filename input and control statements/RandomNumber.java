import java.util.*;
public class RandomNumber
{
	public static void main(String args[])
	{
		int count;
		Random r=new Random();
		System.out.println("Random Numbers: ");
		
		for(count=1;count<2;count++)
		{
			System.out.println(r.nextInt(8));		
		}
	}
}