
public class ThreadMethods extends Thread{
    public static void main(String args[]){
        System.out.println(Thread.activeCount()); // counts the number of threads active in the program
        
        Thread.currentThread().setName("Mainnnnnnnnnn"); //return the name of the current thread executing the code
        
        System.out.println(Thread.currentThread().getName());
        
        System.out.println(Thread.currentThread().isAlive());

    }
}