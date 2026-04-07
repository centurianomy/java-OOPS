									//palindrome

import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the length of the array: ");
	int n=s.nextInt();
	System.out.println();

	int a[]=new int[n]; //array declarartion for a
	int b[]=new int[n]; //array declarartion for b
	
	System.out.println("Enter the array elements: ");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();	
	}
	
	boolean ispalindrome=true;
	for(int i=0;i<n;i++)
	{
		if(b[i]!=a[(n-1)-i])
		{
			ispalindrome=false;
			break;
		}
	}
	
	if(ispalindrome)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("not Palindrome");
	}
	
	}
}