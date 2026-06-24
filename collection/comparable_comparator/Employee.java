public class Employee implements Comparable<Employee> {
    int empId;
    String name;
    int salary;

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int compareTo(Employee e) {
        return this.empId - that.empId; //"-" do logo ki salary ya empl id comare krta h agr salary badi h toh + agr barabar h oh 0 and if less h toh - freturn kregi
        // return this.salary - e.salary; // sort by salary
    }
}