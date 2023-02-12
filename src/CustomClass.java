public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee abc = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for abc
        abc.id=12;
        abc.salary = 34;
        abc.name = "ABC XYZ";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Doe";

        // Printing the Attributes
        abc.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }}

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}