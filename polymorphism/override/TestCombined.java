// combined var + method calling

class A{ //parent class
    
    int x = 10;
    
    void show(){
        System.out.println("A");
    }
}

class B extends A{ //child class
    
    int x = 20;

    void show(){
        System.out.println("B");
    }
}

public class TestCombined{

    public static void main(String args[]){
        A a = new B(); // parent ref + child obj
        System.out.println(a.x);
        a.show();
    }
}

/*output: 
    10
    B
*/