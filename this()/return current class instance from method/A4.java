					//6. can be used to return the current class instance from the method.



public class A4
{
	public A4 m()  //A4 is a return type not a constructor-->(void) aur (int) k alawa bhi return types hote h java m Each class can serve as a unique return type.
	{
		System.out.println("i am from m");

		return this;  //type match hona chahiye so (this) is refering to (A4) since it is matched so it will print the address
	}
	public void n()
	{
		this.m();
	}
	public static void main(String args[])
	{
		A4 a=new A4();
		a.n();
		System.out.println(a.m());
		a.m();
	}

}


	     /* O/P -->	i am from m  ???????
			i am from m
			A4@2f92e0f4
			i am from m 
		flow of this code   */