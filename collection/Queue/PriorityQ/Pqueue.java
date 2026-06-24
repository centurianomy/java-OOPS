
import java.util.*;
public class Pqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(5);     // insert (same as add)
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(10);      // insert duplicate element allowed

        System.out.println(pq);

        System.out.println(pq.peek());       // get Left element (smallest)
        

        pq.poll();       // remove top element
        System.out.println(pq);

        pq.poll();       // remove top element
        System.out.println(pq);

        
        System.out.println(pq.isEmpty());    // check empty
        System.out.println(pq.size())       ;       // size

        // Return the elements in asc order and deletes it strarting from head        
        // while (!pq.isEmpty()) {
        //     System.out.println(pq.poll());
        // }
    }
}


/*
    It uses a Heap (Binary Heap) internally

    Think like this:

    Elements are arranged in a tree structure   
    The top of the heap always stores:
    smallest element (default)
    OR largest (if max heap)
*/
