import java.util.*;

class ArrayDequeueEx{
    public static void main(String args[]){
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        aq.add(10); //insert from first
        aq.addLast(20);
        aq.addFirst(30);
        aq.add(40);
        aq.addLast(40); //insert from last
        System.out.println(aq);
        aq.removeFirst();
        System.out.println(aq); 

        System.out.println(aq.getFirst());
        System.out.println(aq.getLast());
    }   
}