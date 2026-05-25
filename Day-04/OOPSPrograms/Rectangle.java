package Day-04.OOPSPrograms;

import java.util.Scanner;

public class Rectangle {

    double length;
    double width;

    Rectangle(double length, double width) {

        this.length = length;
        this.width = width;
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Rectangle rectangle1 = new Rectangle(length, width);

        double area1 = rectangle1.calculateArea();
        double perimeter1 = rectangle1.calculatePerimeter();

        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rectangle1.getLength());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Area: " + area1);
        System.out.println("Perimeter: " + perimeter1);
    }
}