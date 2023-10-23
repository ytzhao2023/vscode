package runoob;

public class EmployeddTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Happy");
        Employee employee2 = new Employee("Love");

        employee1.employeeAge(26);
        employee1.employeeDesignation("Senior");
        employee1.employeeSalary(2000);
        employee1.printEmployee();

        employee2.employeeAge(23);
        employee2.employeeDesignation("Juniot");
        employee2.employeeSalary(1000);
        employee2.printEmployee();
    }
    
}
