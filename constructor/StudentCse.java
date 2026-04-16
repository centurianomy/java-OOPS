							//constructor chaining
public class StudentCse //extends Object <--we can write this also and also write super in below class.
{
	String name;
	int roll;
	int age;

	//constructor created.	
	public StudentCse(String name, int roll, int age) 	
	{	
		this(age);
		this.name=name;
		this.roll=roll;
	}


	public StudentCse(int age) //constructor created.
	{
		//super();
		this.age=age;
	}
	public void displayValue()
	{
		System.out.println("Name is:"+name);
		System.out.println("Roll is:"+roll);
		System.out.println("Age is:"+age);
	}
	public static void main(String agrs[])
	{
		StudentCse s1=new StudentCse("Arvind", 1234, 18);
		StudentCse s2=new StudentCse("Kailash", 3421, 19);
		s1.displayValue();
		s2.displayValue();
	}
}


     							//without constructor chaining


public class StudentCse //extends Object <--we can write this also and also write super in below class.
{
	String name;
	int roll;
	int age;

	//constructor created.	
	public StudentCse(String name, int roll, int age) 	
	{	
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	public void displayValue()
	{
		System.out.println("Name is:"+name);
		System.out.println("Roll is:"+roll);
		System.out.println("Age is:"+age);
	}
	public static void main(String agrs[])
	{
		StudentCse s1=new StudentCse("Arvind", 1234, 18);
		StudentCse s2=new StudentCse("Kailash", 3421, 19);
		s1.displayValue();
		s2.displayValue();
	}
}


