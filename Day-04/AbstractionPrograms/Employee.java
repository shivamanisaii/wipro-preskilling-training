package Day-04.AbstractionPrograms;

abstract class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();

    void displayDetails() {

        System.out.println("Employee : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Bonus : " + calculateBonus());
        System.out.println("Total : " + (salary + calculateBonus()));
    }
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.2;
    }
}

class Developer extends Employee {

    Developer(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return salary * 0.1;
    }
}
