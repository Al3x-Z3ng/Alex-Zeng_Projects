public class Employee {
    private String firstName;
    private String lastName;
    private static int id = 1;
    private int employeeId;
    private int salary;
    Employee(String firstName, String lastName, int salary){
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        employeeId = id;
        id++;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return getFirstName() + " " + getLastName();
    }
    public int getAnnualSalary(){
        salary = getSalary() * 12;
        return salary;
    }
    public int raiseSalary(int percent) {
        salary = salary * percent/100 + salary;
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Employee[id: " + employeeId + ", name: " + getName() + ", salary: " + salary + "]";
    }
}
