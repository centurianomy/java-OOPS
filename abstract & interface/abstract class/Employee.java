									//Abstract class
public abstract class Employee extends Base
{
	public abstract void tvOn();// error: Employee is not abstract and does not override abstract method tvOn() in Employee public class Employee //abstract used here
	public void displayInfo()
	{
		System.out.println("Hello from india");
	}

	/*public static void main(String args[])// since we have created a sub class so psvm will not be used here
	{
		Employee e=new Employee();
		e.displayInfo();
	}*/
}




/* 1. abstract methods ki body nhi hoti vo sirf declare hote h
   2. abstract class tb banate h jbmeri class k andar ek bhi abstract method a jaye.
   3. abstract class ka constructor possible h ki nhi ? ->Yes it is possible iske liye "Base" class bana do (Derived->Employee->Bse->Object) 

*/

/*                                    throws an error!->error: Employee is abstract; cannot be instantiated Employee e=new Employee();

public  abstract class Employee //abstract used here
{
	public void displayInfo()
	{
		System.out.println("Hello from india");
	}
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.displayInfo();
	}
}

*/