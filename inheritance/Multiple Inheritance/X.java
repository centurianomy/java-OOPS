/*								--> This is our Derived class <--
                                 

public class X extends Andy, Ben   //not possible in java,
 {
	public void run()
	 {
	  System.out.println("Running from X");
	 }
	   public static void main(String args[])
	     {
		X x=new X();
		x.run();			
	     }
 }
*/

                                                                  //Note:

//there are constructors in java i.e parameterised and non parameterised made by the user, (if user has not made any constructor than in that case java will automatically             // make a constructor. 
//java ki super class hoti h Object class agr humne koi class doosri class se derive nhi ki h toh java automatically Object class se inherit ho jayega. 
//constructir has same name as that of class, {there is no return type in constructor}.
//object bnte hi constructor khud invoke ho jata h.
//agr default constructor nhi h toh java khud ek constructor bana degi i.e [ public Teacher() { super() } ] super n base class k constructor ko call krne ki koshish ki 



                                                                  // -->Constructor in java

public class X extends A, B   //not possible in java,
 {
       /* public void run()
	   {
	    System.out.println("Running from X");
	   } */

	  public X() //constructor
	   {
	    super(); 
	   }
	  public static void main(String args[])
	     {
	       X x=new X();
	       x.run();			
	     }
 }
