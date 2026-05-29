
// Normal case
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

public class Test1{

    public static void main(String args[]){
        B b = new B(); // child ref + child obj
        b.display();
    }
}

/*NOte: when (child ref + child obj) ->(valid) no error
            Method of child class executes
    
        java uses runtime poly,
        at Compile time, java checks-> whether class B have a method display()?
            compilation success

        at Runtime, java looks at the actual obj i.e new B()
            and asks which obj shoulkd i execute? 
            obj is B --> so it executes obj B

        output: B

            
            */