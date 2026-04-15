//Example of call by reference


public class SwapNumbers
{
	int num1; //instance variable
	int num2;
   public SwapNumbers(int num1, int num2) //parameterised constructor
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int getNum1()
	{
		return this.num1;
	}
	
	public int getNum2()
	{
		return this.num2;
	}

	public void swapLogic()
	{
		this.num1=this.num1+this.num2;
		this.num2=this.num1-this.num2;
		this.num1=this.num1-this.num2;
	}

	public static void main(String args[])
	{
		SwapNumbers sn=new SwapNumbers(5,10);
		System.out.println("Numbers before swapping are num1 "+sn.getNum1()+" and Num2 "+sn.getNum2());
		sn.swapLogic();
		System.out.println("Numbers after swapping are num1 "+sn.getNum1()+" and Num2 "+sn.getNum2());
	
	}
}