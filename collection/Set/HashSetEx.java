import java.util.*;
public class HashSetEx{
    public  static void main(String args[]){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        System.out.println(hs); //inserted order is not preserved in set
        
        hs.add(20); //duplicate value is not allowed in set
        System.out.println(hs);

        hs.add(null); //null value is allowed in set
        System.out.println(hs);
    }
}