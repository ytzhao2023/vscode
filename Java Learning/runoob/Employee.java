package runoob;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // the constructor of Employee. Used to initialize the object, when you new an object of employee, it will be transfer automatically.
    public Employee(String name){
        this.name = name;
    }

    // set the value of age as instance variables.Instance variables are declared in a class, but outside a method, constructor or any block.
    public void employeeAge(int employeeAge){
        age = employeeAge;
    }

    // set the value of designation
    public void employeeDesignation(String employeeDesignation){
        designation = employeeDesignation;
    }

    // set the value of salary
    public void employeeSalary(double employeeSalary){
        salary = employeeSalary;
    }

    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + designation);
        System.out.println("Salary: " + salary);
    }

}
