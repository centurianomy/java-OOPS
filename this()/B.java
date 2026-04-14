							//5. can be passed as an argument in the constructor call.

class B
{
	int data=20;  // this is for ambiguity, O/P will still be 10
	A4 obj;

	B(A4 obj)  //constructor
	{
		this.obj=obj;
	}

	void display()
	{
		System.out.println(obj.data); //using data member of A4 class -->(obj.data) hold the reference of A4 class.
	}
}