
// method hiding very important concept

class Parent {
    //static method
    static void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    //static method
    static void display() {
        System.out.println("Child");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display(); //output: Parent, kyuki child hide hogya

        // Child p = new Child();
        // p.display(); //output: child
        
    }
}

//hide kya hua child but kyu
// static method kabhi over ride nhi hoga
// note: the static method belongs to a clss not an obj, so this is method hiding not overriding

