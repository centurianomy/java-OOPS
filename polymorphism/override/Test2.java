
//jiska obj hoga uska  method print hoga

class A{ //parent class
    void display(){
    System.out.println("A");
    }
}

class B extends A{ //child class
    void display(){
    System.out.println("B");
    }
}

public class Test2{

    public static void main(String args[]){
        //valid: storing object of child class in ref of parent class
        A a = new B(); // parent ref + child obj
        a.display();
        
        /* not allowed: cannot store obj of parent class in the ref of child class.
        //B b =  new A(); // child ref + parent obj
        //b.display();
        */
    }
}

/*NOte: when (parent ref + child obj) ->(valid) no error
            Method overriding.

        *for overriden methods -> method execution depends-> the obj type, not the ref type*          

  java uses runtime poly,
    at Compile time, java checks-> whose ref? i.e A -> does class A have the req method display()?
        if (yes) -->code compile

    at Runtime, java checks-> whcih obj is actually created
        obj B so it executes obj B

  output: B

*/

/* think of it as: 
    ref A: persmission check (Compile time)
    object: actual method execution (Run time) 

    *and thats the reason overriding is called runtime poly*
*/