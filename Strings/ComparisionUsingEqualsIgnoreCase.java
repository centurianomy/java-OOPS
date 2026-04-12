								//Comparision Using EqualsIgnoreCase()


class ComparisionUsingEqualsIgnoreCase
{
	public static void main(String args[])
	{
		String s1="Ram";
		String s2="rAm";

		boolean x = s1.equals(s2);  //consider case sensitivity  -->here we are storing the value in x which is of boolean type. 
		System.out.println(x);  //false
		
		boolean y = s1.equalsIgnoreCase(s2); //ignore case sensitivity
		System.out.println(y);  //true

	}
}