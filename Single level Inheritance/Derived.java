
public class Derived extends SuperClass
 {
  public void doSomething()
  {
   System.out.println("calling from derived class");
  }

   public static void main(String args[])
   {
    SuperClass s=new Derived();
    s.sayHello().doSomething();
   }

 }