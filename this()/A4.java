							//5. can be passed as an argument in the constructor call.

class A4  //*****why not extends B***** we dont need to use it 
{
	int data=10;

	A4() //constructor
	{
		B b=new B(this); // object of b class and its constructor will be invoked and both classes are not in relationship
		b.display();
	}
	public static void main(String args[])
	{
		A4 a=new A4(); //object created and constructor invoked
	}
}