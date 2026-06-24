//# LinkedList

import java.util.*;

public class LinkedListEx {
    public static void main(String args[]){      
    
        List<Integer> al=new LinkedList<Integer>(); // <> --> generic type
        al.add(5); //collections obj lete h primitive nhi lete yaha "5" ek wrapper class ka obj h
        al.add(6);
        
        //al.add("Sumit"); // string toh obj hota hi h
        al.add(null); //null val obj ki default val hoti h toh isse daal skte h
        al.add(2);

        System.out.println("List values are " + al);
        System.out.println(al.get(3));
        
        al.remove(2); //remove by index
        
        //list after remove
        System.out.println(al);

        //set method
        al.set(1, 3);

        System.out.println(al);

        System.out.println(al.indexOf(5));

        al.add(5);

        System.out.println(al);

        System.out.println(al.lastIndexOf(5));
        System.out.println(al.lastIndexOf(2));

        //using iterator
        // Iterator<Integer> i = al.iterator();
        //     while(i.hasNext()){ //while ko agee badhata h hasNext()
        //         System.out.println(" " + i.next());
        //     }


        ListIterator<Integer> li = al.listIterator();
            while(li.hasNext()){ //while ko agee badhata h hasNext()
                System.out.println(" " + li.next());
            }

            //reverse m print krne k liye
            while(li.hasPrevious()){
                System.out.println(" " + li.previous());
            }

        //sort the arraylist
        Collections.sort(al);
        System.out.println();
        System.out.println(al + " ");      
        
        
        }
} 