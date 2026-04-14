							//this keyword in java

/*	1. this can be used for refering current class instance in variable.(is a kind of pointer or a reference variable)*
	2. used to  invoke current class method(implicity).
	3. this() can be used to invoke current class constructor.
	4. can be passed as an argument in the method call.
	5. can be passed as an argument in the constructor call.--> same as constructor chaining
	6. can be used to return the current class instance from the method. */

class Student
{
	int rollno;
	String name;
	float fee;

	Student(int rollno, String name, float fee)
	{
		this.rollno=rollno();//without using this keyword the O/P will be 0 null 0.0 
		this.name=name();
		this.fee=fee();
	} 
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}