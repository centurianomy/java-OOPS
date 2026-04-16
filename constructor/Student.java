public class Student //extends Object <--we can write this also and also write super in below class.
{
	String name;
	int roll;

	public Student(String name, int roll) //constructor created
	{
		//super(); laga degi and fhir ye object k pass jayegi(since current class ki koi base class nhi h) ->objects extends lag jayega fhir waha se instance leke ayegi si k pass.	
		this.name=name;
		this.roll=roll;
	}

	/*public Student(int age)
	{
		//this.age();
	} */

	public void displayValue()
	{
		System.out.println("Name is:"+name);  //s1 and s2 k reference m jo vaalue store hongi unhe print krwayega 
		System.out.println("Roll is:"+roll);
	}
	public static void main(String agrs[])
	{
		Student s1=new Student("Arvind", 1234);
		Student s2=new Student("Kailash", 3421);
		s1.displayValue();
		s2.displayValue();
	}
}





/*
public class Student extends Object //<------------------------------------------!
 {     					 //                                      |
	String name;   //
	int roll;     //							 |

	public Student(String name, int roll) //constructor created  //          |
	{
		super(); //<-----------------------------------------------------!
		this.name=name;  //
		this.roll=roll;  //
	}

*/




