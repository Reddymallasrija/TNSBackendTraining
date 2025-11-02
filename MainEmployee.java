//Class Structure
class Employee{
    String name;
    int id;
    String role;
    int salary;
    void print(){
        System.out.println("Employees Details:\nName-"+name+"\nID-"+id+"\nRole-"+role+"\nSalary-"+salary);
    }
}
//Execution of class
public class MainEmployee{
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.name="Rajesh";
        emp.id=45;
        emp.role="Front-End";
        emp.salary=45000;
        emp.print();
        Employee emp1= new Employee();
        emp1.name="Rani";
        emp1.id=46;
        emp1.role="Back-End";
        emp1.salary=55000;
        emp1.print();
    }
}