import java.util.*;

public class EmployeeEx{
    public static void main(String args[]){
        ArrayList<String> emp=new ArrayList<>();
            // emp.add(new Employee(101, "Amit", 200000));
            // emp.add(new Employee(102, "bhana", 300000));
            // emp.add(new Employee(103, "Chirag", 400000));
            // emp.add(new Employee(104, "Deesha", 900000));
            // emp.add(new Employee(105, "Ekta", 100000));
            emp.add("Amit");
            emp.add("Bhani");
            emp.add("Rohit");
            emp.add("Sumit");
            System.out.println("Before sortung " + emp + " ");
            System.out.println();
            Collections.sort(emp); //it will givw error untill we handle it with compareTo() in Employee class
            System.out.println("After sortung " + emp + " ");

    
    }
}