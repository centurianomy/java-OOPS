//




class ComparisionUsingEquals
{
	public static void main(String args[])
	{
		String s1="Sachin";
		String s2="Sachin";
		String s3=new String("Sachin");
		String s4="Saurav";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}






//equals method object ko compare krra h s1 and s2 ek hi object ko refer krr rha h.

//public boolean equals(object another) compares this string to the specified object.
//public boolean equalsignoreCase(String another) compares this string to another string.


/*      s1.equals() method object compare krega
	s1.equals() mae string compare  case sensitivity.

*/