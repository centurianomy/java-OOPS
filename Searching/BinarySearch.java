//binary search

import java.util.Scanner;
public class BinarySearch
{
	public static void main(String args[])
	{ 
	 
	  int flag=0;
	
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the length of array: "); //length of array
		int n=s.nextInt();

		int arr[]=new int[n]; //array declaration

		System.out.print("Enter the key element to search: "); //enter key element to search
		int key=s.nextInt();
	
		System.out.println("Enter the array elements: "); //enter the elements
		for(int i=0; i<n; i++)
		{
			arr[i]=s.nextInt();
		}
		
		int f=0;
	  	int l=n-1;
	  	int mid;
		
		while(f<=l)
		{
			mid=(f+l)/2;
			
			if(key==arr[mid])
			{
				System.out.println("Element found at index "+mid);
				flag=1;
				break;
			}
			else if(key<arr[mid])
			{
				l=mid-1;
			}
			else
			{
				f=mid+1;
			}	
		}
		if(flag==0)
		{
			System.out.println("Element not found!");
		}
	}
}