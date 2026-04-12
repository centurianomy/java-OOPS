//Strings- sequence of characters (String is a class not a keyword)

public class Name
{
	public static void main(String args[])
	{
		String s1="Aditya"; //String literal
		String s2="Rai";
		String s3="Aditya"; //it doesnt create a new instance since aditya is already created 

		//String s1=s1.concat(s2); error caue string isd immutable
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1+" "+s2); //other means

	}
}







/* String is an object itself 
	String object can be created bye two ways: string literal and new keyword

	String is a class which is stored with final keyword, no one can inherit it taki string class ko over ride na kiya ja ske na inheritance ho na overriding.

	Each time u create a string literal the jvm checks the "String constant pool first", if the string alresdy exists in the pool, a reference to the pooled instance is returned, otherwise a new string instance is created and plced in the pool.

	new se --heap m jata h 
	literal se pool m jata h

*/
