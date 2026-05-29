class A{
    void display(){
    System.out.println("A");
    }
}

public class B{

    public static void main(String args[]){
        A a = new A(); // parent ref + parent obj
        a.display();
    }
}

/*NOte: when (parent ref + parent obj)
            No polymorphism involved.
*/