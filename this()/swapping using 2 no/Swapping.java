class Swapping
{
	int num1;
	int num2;

	Swapping(int num1, int num2)  //constructor
	{	
		this.num1=num1;
		this.num2=num2;
	}
	
	int getNum1()
		{
		return this.num1;
		}
	int getNum2()
		{
		return this.num2;
		}


	void swapNo()
	{
		this.num1=this.num1+this.num2;
		this.num2=this.num1-this.num2;
		this.num1=this.num1-this.num2;
	}
	public static void main(String args[])
	{
		Swapping s=new Swapping(5, 10);

		System.out.println("Numbers before swapping "+s.getNum1()+" and "+s.getNum2());  //calling from static to non static
		s.swapNo();
		System.out.println("Numbers after swapping "+s.getNum1()+" and "+s.getNum2());
	}
}