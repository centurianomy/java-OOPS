public class Employee
   {

    public static void printName(String s)
	{ 
	  System.out.println("name is " +s);	//Java is a (object oriented programming) so it is important to make objects
	}

    public void age(int a)
	{ 
	System.out.println("Age is " +a);
	}




    public static void main(String args[])
	{
	

Employee e=new Employee();  //int a=10,this -new Employee- holds an address of some identity, e is reference variable(acting as a pointer in java)
 
	/*Employee.printName("Raju");
	System.out.println(e);
	e.age(27);
	Employee.printName("Chitti");*/


	Employee.printName("Chirag");
	Employee.printName("Raj");
	e.age(22);
	e.age(20);
	System.out.println(e);  // e is reference variable

	}

   }