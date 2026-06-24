import java.util.*;

class TreeSetEx{
    public static void main(String args[]){

        /* either use Wrapper class Integer
            Integer arr[] = {10, 20, 20, 30, 30};
            TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(arr));        
         */

        // or primitive data type
        int arr[]={10, 20, 20, 30, 30};

        TreeSet<Integer> ts=new TreeSet<>();
        
        //insert the elements into Treeset
        for(int x : arr){
            ts.add(x);
        }
        
        //main logic 
        if(ts.size()<2){
            System.out.println(-1);
        }
        else{
            System.out.println(ts.lower(ts.last()));
        }


        

    }
}

// ts.first()   ts.last()   there are treeset's own methods 