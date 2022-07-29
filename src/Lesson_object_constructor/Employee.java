package Lesson_object_constructor;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String department;

    public Employee(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double uvelichenieZarplati() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee st1 = new Employee(1, "Ivan", 24, 100, "IT");
        Employee st2 = new Employee(2, "OLeg", 21, 230.45, "IT");

        st1.uvelichenieZarplati();
        st2.uvelichenieZarplati();
        System.out.println("Новая зарплата работника " + st1.name + ": " + st1.salary);
        System.out.println("Новая зарплата работника " + st2.name + ": " + st2.salary);
    }
}





