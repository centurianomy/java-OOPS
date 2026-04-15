public class Employee
{
	String name;
	final String PAN; //we have used final & an error occurs!, just like Adhar-no and PAN in real life are assigned to a single person forever.
	int age;

public Employee(String name, String PAN, int age)
	{
	this.name=name;
	this.PAN=PAN;
	this.age=age;
	}
public void displayInfo()
	{
	System.out.println("Name is "+name);
	System.out.println("PAN is "+PAN);
	System.out.println("Age is "+age);
	}
public void modifyInfo(String name, String PAN, int age)
	{
	this.name=name;
	this.PAN=PAN;
	this.age=age;
	}
public static void main(String args[])
	{
	Employee e1=new Employee("Ramu","PGGRS09E",32);
	e1.displayInfo();
	}
}