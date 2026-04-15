public class MetOver
{
	public void area(int a, int b)
	{
	System.out.println("Area is "+(a*b));
	}

	public void area(String s, int a, int b)
{
	if(a==b)
	{
	System.out.println("it is a square");
	}
	else
	{
	System.out.println("It is rectangle");
	}
}
	public static void main(String agrs[])
		{
		MetOver m=new MetOver();
		m.area(10,10);
		m.area("Hello",10,10);
		}
}