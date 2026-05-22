public class Derived extends Employee //error occurs
{

public void tvOn()
{
System.out.println("TV is on");
}
	public static void main(String agrs[])
	{
	Derived d=new Derived();
	d.displayInfo();
	}
}