
// unhi members ko access kr skte h jo Parent class m declared h
// if Child class m extra methods h, we cannot call them directly through parent ref 

class A{ //parent class
    void show(){ //method is different not void show(), compile time error de dega
    System.out.println("A");
    }
}

class B extends A{ //child class
    void display(){ 
    System.out.println("B");
    }
}

public class Test3{

    public static void main(String args[]){
        A a = new B(); // parent ref + child obj
        a.display();
    }
}

/*NOte: when (parent ref + child obj) ->(valid) no error
            Method overriding.

        *for overriden methods -> method execution depends-> the obj type, not the ref type*          

  java uses runtime poly,
    at Compile time, java checks-> whose ref? i.e A -> does class A have the req method display()?
        if (NO) --> compile error X

  output: compile time error

*/

/* think of it as:
        agr ref class m vo method hi nhi h jise call krre h toh compile tim eerror        
*/