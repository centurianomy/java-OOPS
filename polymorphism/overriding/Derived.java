public class Derived extends Base
{
	/*int l;
	  int b;here we have locally used the instances so no need to declare them.*/

	public int area(int l, int b)
	{
	 if(l==b)
		{
		System.out.println("area of square is "+super.area(l,b));
		}
	 else
		{
		System.out.println("area of rectangle is "+super.area(l,b));
		}
			return 0;
		}

	public static void main(String args[])
	{
		Derived d=new Derived();
		d.area(10,30);
	}
}