// 1. throw a custom exception if min balance is not set  

class ExceptionEx extends Exception{
    ExceptionEx(String message){
        super(message); //calls construct of class "Exception"
    }
}

class CustomEx{
    public void debit() throws ExceptionEx{ //indicates that this method can throw ExceptionEx type of exception
        int total=50000;
        int withdraw=4500;
        int balance=total-withdraw;

        if(balance < 1000){
            throw new ExceptionEx("Minimum Balance should be 1000"); // new ExceptionEx("Minimum Balance should be 1000")-->is object of ExceptionEx class
            //custom message is passed 
        }
        else{
            System.out.println("Balance: "+ balance);
        }
    }

}

public class Myexception{
    public static void main(String args[]){
        CustomEx cx=new CustomEx();

        try{
            cx.debit();
        }
        catch(ExceptionEx ex){
            System.out.println(ex.getMessage());
        }
    }
}

//para costr bhi java m khudse bn jata h ? ya sirf defauot hi auto craete hota h bs?