public abstract class Employee //abstract used here
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
