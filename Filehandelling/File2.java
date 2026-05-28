				//File handelling Reading


import java.io.*;
class File2
{
	public static void main(String args[])
	{
		try
		{

			//BufferedReader br=new BufferedReader(new FileReader("output2.txt"));

			FileReader r=new FileReader("output2.txt");
			BufferedReader br=new BufferedReader(r); //for reading line by line
			
			String line;
			while((line=br.readLine())!=null)  //br.readLine() is to read lines
			{
				System.out.println(line);
			}
			r.close();
		}

		catch(IOException ie)
		{
			System.out.println(ie);
		} 
			
	}
}