package Day-03.ConstructorPrograms;
import java.util.Scanner;

public class Cuboid {

    double l, b, h;

    Cuboid() {

        l = 10;
        b = 10;
        h = 10;

        System.out.println("Constructor without parameter");
        System.out.println("Volume is " + (l * b * h));
    }

    Cuboid(int l, int b, int h) {

        this();

        this.l = l;
        this.b = b;
        this.h = h;

        System.out.println("Constructor with parameter");
        System.out.println("Volume is " + (double)(l * b * h));
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int b = s.nextInt();
        int h = s.nextInt();

        Cuboid cuboid1 = new Cuboid(l, b, h);
    }
}
