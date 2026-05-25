package Day-04.AbstractionPrograms;

public class Main {

    public static void main(String[] args) {

        Employee m1 = new Manager("Shiva", 85000);
        Employee d1 = new Developer("Sahith", 65000);

        m1.displayDetails();
        d1.displayDetails();
    }
}