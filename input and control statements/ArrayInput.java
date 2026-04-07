									//Fibonacci

import java.util.Scanner;
public class ArrayInput
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of array elements: ");
		int n=s.nextInt();
		
		int arr[]=new int[n]; //array declaration
		

		System.out.println("Enter the array elements: "); //array input
		
	for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}


		System.out.println("The entered array elements are: ");
		
	for(int i=0; i<n; i++)
		{
			System.out.println(arr[i]);
		}	
		
	}


}