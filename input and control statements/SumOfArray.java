//sum of the numbers in array
import java.util.Scanner;
public class SumOfArray
{
	public static void main(String args[])
	{
		int i;
		int n;
		int sum=0;
		int arr[];

		Scanner s=new Scanner(System.in);
		
		System.out.println("*****************************************************");
		System.out.print("Enter the number of array elements u want: ");
		n=s.nextInt();
		
		arr= new int[n]; //or int arr[]=new int[n]; /*array declared*/
		
		System.out.println("Enter the elements: ");
		for(i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		
		System.out.println("The sum of the "+i+" elements of the given array is "+sum);
		//System.out.println();
		System.out.println("*****************************************************");
		
	}
}
