
/*=========== Inter Thread Communication ===========*/

class Customer{
    int amount = 5000;
    synchronized void withdraw(int amount){
        System.out.println("Going to withdraw...");

        while(this.amount < amount){
            System.out.println("Your accnt has less balance...");
            break;

//ye wala part wait ko chalane k liye chalana h 
            // try{
            //     wait(); //wait() method is used to make the current thread wait until another thread calls notify() or notifyAll() method on the same object.
            // }
            // catch(InterruptedException ie){
            //     System.out.println(ie);
            // }

        }
        this.amount=this.amount-amount;
        System.out.println("Withdraw completed...Current balance: "+ this.amount);
    }
    synchronized void deposite(int amount){
        System.out.println("Going to deposite...");
        this.amount=this.amount+amount;
        System.out.println("Deposite completed...Current balance: "+ this.amount);
    // jb deposite krenge tb wait() ko notify() krne k liye is lino ko chalana    
        //notify();
        
    }
}


class WithdrawThread extends Thread{
    Customer c;
    WithdrawThread(Customer c){
        this.c=c;
    }
    public void run(){
        c.withdraw(10000);
    }
}

class DepositThread extends Thread{
    Customer c;
    DepositThread(Customer c){
        this.c=c;
    }
    public void run(){
    // ye wala part baad m use krna pehle is program ko normally chalake dekho -5000 ayega amount
        //c.deposut(20000);
    }
}


public class Interthreadingcommunica{
    public static void main(String args[]){
        Customer c=new Customer();
        WithdrawThread w=new WithdrawThread(c);
        DepositThread d=new DepositThread(c);
        w.start();
        d.start();
    }
}