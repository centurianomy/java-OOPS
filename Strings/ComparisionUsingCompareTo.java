		// CompareTo() compares lexographically i.e. according to dictionary order.[returns integer either +, -, or 0 value]

/*   if s1 == s2: this method returns 0
        s1 > s2: this method returns + value
	s1 < s2: this method returns - value

											

*/

class ComparisionUsingCompareTo
{
public static void main(String args[])
{
String s1="Ratan";
String s2="Ratan";
String s3="Mahendra";

System.out.println(s1.compareTo(s2)); // 0
System.out.println(s1.compareTo(s3)); // 5
System.out.println(s3.compareTo(s1)); // -5
}
}																