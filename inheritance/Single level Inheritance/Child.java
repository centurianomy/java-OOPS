public class Child extends Parent
  {
    public int area(int x, int y)
     {
      return x*y;
     }


     public void print()
        {
           System.out.println("Non-static to non-static method: ");

     
           System.out.println("Answer from child class in child class itself: "+this.area(10,2));
           System.out.println("Answer from parent class in child class: "+super.area(10,3));
       }


      public static void main(String args[])
       {
           Child c=new Child();
           c.print();
       }

  }