// 2. throw a custom excep if voter is noteligible
class ExceptionEx extends Exception{
    ExceptionEx(String message){
        super(message);
    }
}

class CustomEx{
    public void eligibility() throws ExceptionEx{
        int age=17;

        if(age<18){
            throw new ExceptionEx("Minimum age for voting is 18");
        }
        else{
            System.out.println("Congratulations you are eligible");
            System.out.println("your age is "+ age);
        }
    }
}

class Myexception2{
    public static void main(String args[]){
        CustomEx cx=new CustomEx();

        try{
            cx.eligibility();
        }
        catch(ExceptionEx ex){
            System.out.println(ex.getMessage());
        }
    }

}