public class Father extends GrandFather
 {
	public int volumeDown(int vd)
	{
	 //System.out.println(--vd); -->we use (return --vd) and not s.o.p here because in child class we have used (super.methodname) which returns the value instead of printing, so it will throw and error.
	
	  return --vd;
	} 
	
}