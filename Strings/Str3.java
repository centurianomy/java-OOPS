                                       // Using equals() / equalsIgnoreCase() / concat() and understanding POOL and HEAP



public class Str3
{
	public static void main(String args[])
	{	
		String s1=new String("Pokemon"); //Heap 
		String s2=new String("Pokemon"); //Heap, Although the string is same and already exists it will still be stored in a new "Heap" with different "object s2".
		
		String s3="RAWAT"; //pool
		String s4="RAWAT"; //same pool
		String s5="rawat"; //pool with saperate staorage. 
 
		
		System.out.println(s1.equals(s2)); //case sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); //non-case sensitive
		
		System.out.println(s2);
		System.out.println(s1.concat(s2));

		System.out.println("s1 identity hash code: " + System.identityHashCode(s1));  //prints memory address of the Strings
		System.out.println("s2 identity hash code: " + System.identityHashCode(s2));
		System.out.println("s3 identity hash code: " + System.identityHashCode(s3));
		System.out.println("s4 identity hash code: " + System.identityHashCode(s4));
		System.out.println("s5 identity hash code: " + System.identityHashCode(s5));
	
	
	}

}





/* s1 identity hash code: 798154996  -->both "s1" and "s2" have similar string text but are still stored saperately. 
   s2 identity hash code: 868693306
   s3 identity hash code: 1746572565  -->both "s3" and "s4" have similar string texts so "s4" will be storing the reference of "s3" object in the "String const pool". 
   s4 identity hash code: 1746572565
   s5 identity hash code: 989110044
*/