public class Child extends Father
 {
	public void display()
	 {
	  System.out.println(super.volumeUp(10));
          System.out.println(super.volumeDown(10));
	 } 
	public static void main(String args[])
	 {
	   Child c=new Child();
	   c.display();
	}
 }