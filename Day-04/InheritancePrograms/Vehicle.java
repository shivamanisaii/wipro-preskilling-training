package Day-04.InheritancePrograms;

public class Vehicle {

    void noOfWheels() {
        System.out.println("No of wheels undefined");
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Scooter();
        Vehicle v3 = new Car();

        v1.noOfWheels();
        v2.noOfWheels();
        v3.noOfWheels();
    }
}

class Scooter extends Vehicle {

    void noOfWheels() {
        System.out.println("No of wheels 2");
    }
}

class Car extends Vehicle {

    void noOfWheels() {
        System.out.println("No of wheels 4");
    }
}
