								//File handelling writing and reading 

import java.io.*;
class File3
{
	public static void main(String args[])
	{
	try
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("output3.txt",true)); //add true "keyword" to append text.
		bw.write("Here we will write and read the file in one.");
		bw.newLine();  //use instead of "\n".
		bw.write("Human is God sleeping and God is human awake.");
		bw.newLine();
		bw.write("Powerful quote isn't it ?");
		bw.newLine();
		bw.close();  //Free resources.

		BufferedReader br=new BufferedReader(new FileReader("output3.txt"));  //for reading text.
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
	}	

	catch(IOException ie)
	{
		System.out.println(ie);
	}

	}
}