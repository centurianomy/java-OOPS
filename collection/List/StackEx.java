import java.util.*;

class StackEx{
    public static void main(String args[]){
        Stack<String> s=new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        System.out.println(s);
        
        System.out.println(s.peek());
        
        s.pop();
        System.out.println(s);

        System.out.println(s.search("B"));// returns the 1-based position of the element from the top of the stack. If the element is not found, it returns -1. 
       
        System.out.println(s.isEmpty());
    
    
    }
}