public class EmployeeClone {

    public static void main(String[] args) {

        Employee e1 = new Employee("Shiva", "IT");

        Employee e2 = new Employee(e1);

        e1.setDepartment("Finance");

        System.out.println("Original Object:");
        e1.display();

        System.out.println("\nCloned Object:");
        e2.display();
    }
}

class Employee {

    String name;
    String department;

    Employee(String name, String department) {

        this.name = name;
        this.department = department;
    }

    Employee(Employee other) {

        this.name = other.name;
        this.department = other.department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
