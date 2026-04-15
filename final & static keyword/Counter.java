						//static variables in java
/* 1. To provide memo efficiency static keyword was introduced.
      (static uses common space for all the objects.) 
   2. Instance variable like int float double etc, these stores different values for diff objs. */



public class Counter
{
static int a=10; //here static is used to declare a variable and O/P will be 11,12,13 otherwise I/P will be 11,11,11.
public Counter()
{
System.out.println(++a);
}
public static void main(String args[])
{
new Counter(); //three objects is being shared 
new Counter();
new Counter();
}
}


next lect abstract data types.
