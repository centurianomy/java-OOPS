				//File handelling writting


import java.io.*;
class File1
{
	public static void main(String args[])
	{
		try
		{
			FileWriter w=new FileWriter("output1.txt");
			w.write("Hello my name is Chirag Rawat"); 
			w.write("\nI m working with java");
			w.close();
		}

		catch(IOException ie)
		{
			System.out.println(ie);
		} 
			
	}
}