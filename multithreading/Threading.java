//thi program display teh random execution behavior of the threads!

// Multithreading using extends 

class Thread1 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            if(i%2==0){
                System.out.println("even " +i);
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            if(i%2!=0){
                System.out.println("odd " +i);
            }
        }
    }
}

public class Threading{
    public static void main(String args[]){
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        
        try{
            //jiska ref hoga us class ka thread pehle execute hoga
            t1.join(); //error: unreported exception InterruptedException; must be caught or declared to be thrown
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }

        t2.start();
    }
}
