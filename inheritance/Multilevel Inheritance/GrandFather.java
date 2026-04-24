public class GrandFather
 {
	public int volumeUp(int vu)
	{
	 // System.out.println(++vu); -->we use (return ++vu) and not s.o.p here because in child class we have used (super.methodname) which returns the value instead of printing, so it will throw and error.
	
	  return ++vu;

	} 
	
}