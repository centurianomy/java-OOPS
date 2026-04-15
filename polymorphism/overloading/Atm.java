							//overloading

/*Two conditions for overloading:
  1. Same method name but different parameters.
  2. agr sequence of parameters bhi different hogya tb bhi method overloading execute kregi.*/


public class Atm
{
	String Name;
	String withdrawType;
	int debitPin;
	int mobilePass;

public void withdraw(String Name, String withdrawType, int debitPin)  //method 1
	{
		System.out.println("Name of costumer "+Name);
		System.out.println("Withdrawal by "+withdrawType);
		System.out.println("Debit pin "+debitPin);
		System.out.println(" ");
		
	}

public void withdraw(String withdrawType, int mobilePass)  //method 2
	{
		System.out.println("Withdrawal by "+withdrawType);
		System.out.println("Debit pin "+mobilePass);
		System.out.println(" ");
		
	}

public void withdraw(String withdrawType)  //method 3
	{
		System.out.println("Withdrawal by "+withdrawType);
	}

	public static void main(String args[])
	{
		Atm w=new Atm();
		w.withdraw("Chirag Rawat", "Debit Card", 1234);  //parameters for method 1
		w.withdraw("Mobile Banking", 9876);  //parameters for method 2
		w.withdraw("Fingerprint");  //parameters for method 3
	}
}