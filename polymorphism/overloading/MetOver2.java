public class MetOver2
{
	public void voice(String s, int age)
	{
	System.out.println(s+age);
	}

	public void voice(int age, String s)
	{
		System.out.println(age+s);
		
	}
	public static void main(String agrs[])
		{
		MetOver2 m=new MetOver2();
		m.voice("lion",10);
		m.voice(19,"Tiger");
		}
}


//sequence of parameter(method can be same but sequence should be different).