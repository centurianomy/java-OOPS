// combined var + method calling

class A{ //parent class
    void show(){
        System.out.println("A");
    }
}

class B extends A{ //child class
    void show(){
        System.out.println("B");
    }
    void display(){ //display method
        System.out.println("Display B");
    }
}

public class Downcasting{

    public static void main(String args[]){
        A a = new B(); // parent ref + child obj
        ((B)a).display(); //downcasting
        a.show();
    }
}

/*output: 
    Display B
    B
*/