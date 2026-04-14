							// 4. can be passed as an argument in the method call.*
							
	//   Example of call by refernce in java.*



public class S2
{
	public void m(S2 obj) //(2) S2 is a parameter means taking the object of a class S2 jvm enter the method bloack since types have matched.
	{
		System.out.println("method is invoked");
		System.out.println(obj);  //reference
	}

	public void p()
	{
		m(this); //this.m(this); -->(1)this refers to the current object -->:So control goes to m(S2 obj) with obj = s1, and once type is matched it prints it!
	}

	public static void main(String args[])
	{
		S2 s1=new S2();
		s1.p();
		System.out.println(s1);  //reference 
	}
}