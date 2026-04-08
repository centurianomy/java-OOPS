public class Parent
{
    public int area(int x, int y)
{
return ((x*y)/2);
}
     public static void main(String args[])
      {
       Parent p=new Parent();
       System.out.println("Answer from parent class itself: "+new Parent().area(4,3));


      }

}
