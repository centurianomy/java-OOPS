								// Compare Using "==" Operator (it compares reference)



class CompareUsingEqualsToOperator
{
	public static void main(String args[])
	{
		String s1="kohli"; //String const pool
		String s2="kohli";  //String const pool

		String s3=new String("kohli");  //Heap
	
		System.out.println(s1==s2);  //true    
		System.out.println(s1==s3);  //false

		System.out.println("s1 identity hash code: " + System.identityHashCode(s1));
		System.out.println("s2 identity hash code: " + System.identityHashCode(s2));
		System.out.println("s3 identity hash code: " + System.identityHashCode(s3));

	}
}