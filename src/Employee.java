public class Employee extends peeps{
    public Employee(String employeeName) {
        super(employeeName);
    }

    public static void main(String[] args) {
        Employee john = new Employee("John");
        john.sayHello();
        System.out.println(john.name);
    }
}
