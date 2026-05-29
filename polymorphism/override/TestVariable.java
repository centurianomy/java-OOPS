// variable calling

/* Note: for variables java doesnt use runtime polyumorphism
            it only look at ref type*/

class A{ //parent class
    int x = 10;
}

class B extends A{ //child class
    int x = 20;
}

public class TestVariable{

    public static void main(String args[]){
        A a = new B(); // parent ref + child obj
        System.out.println(a.x);
    }
}

//output: 10, jikka ref se call kiya ussi ka var print hoga
