public class Student1 
{
	String name;  //instance variable
	int age;
	int rollno;
	static String college = "Dronacharya";  //static variable

	public Student1(String name, int age, int rollno)
	{
		this.name=name;  //without using (this.) it will print Null values and zeros cause there is confusion kisko konsi value assign krni h.
		this.age=age;
		this.rollno=rollno;
		
	}
	
	public void display()
	{
		System.out.println("Name is "+name);
		System.out.println("age is "+age);
		System.out.println("rollno is "+rollno);
		System.out.println("college is "+college);
		System.out.println(" ");
	}

	public static void main(String args[])
	{
		Student1 s1=new Student1("Arnav", 97, 1123);
		Student1 s2=new Student1("Dubey", 98, 1124);
		s1.display();
		s2.display();
	}
}