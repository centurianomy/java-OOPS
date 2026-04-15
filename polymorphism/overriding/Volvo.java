						//overriding: Inheritance is necessary!


public class Volvo extends Car
{
	int Price;
	int GST;

	public int price(int Price, int GST)
		{
		System.out.println("It is world's safest car manufacturer till date with 5 star safety rating");
		System.out.println("Total price is: "+super.price(Price, GST));
		System.out.println(" ");
		return 0;
		}

	public static void main(String args[])
		{
		Volvo v=new Volvo();
		v.price(5000000, 197000);
		v.price(3900000, 100000);
		}
	     /* Volvo v=new Car();          error: incompatible types: Car cannot be converted to Volvo -->(Volvo v=new Car();)
		v.price(5000000, 197000);
		v.price(3900000, 100000); */
}

//Because String is a subtype of Object, this is a valid example of covariant return type.

