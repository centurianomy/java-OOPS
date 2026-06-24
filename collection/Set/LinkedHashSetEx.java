import java.util.*;
public class LinkedHashSetEx{
    public  static void main(String args[]){
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs); //inserted order is preserved in LinkedHashSet  
        
        hs.add(20); //duplicate value is not allowed in set
        System.out.println(hs);

        hs.add(null); //null value is allowed in set
        System.out.println(hs);
    }
}