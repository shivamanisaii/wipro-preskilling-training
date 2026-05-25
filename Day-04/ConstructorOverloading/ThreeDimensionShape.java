package Day-04.ConstructorOverloading;

public class ThreeDimensionShape {

    double width, height, depth;

    ThreeDimensionShape(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

    ThreeDimensionShape(double l) {

        height = l;
        width = l;
        depth = l;
    }

    ThreeDimensionShape() {

        height = 0;
        width = 0;
        depth = 0;
    }

    double volume() {

        return width * height * depth;
    }

    public static void main(String args[]) {

        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

        double volume;

        volume = shape1.volume();
        System.out.println("Volume of shape1 is " + volume);

        volume = shape2.volume();
        System.out.println("Volume of shape2 is " + volume);

        volume = shape3.volume();
        System.out.println("Volume of shape3 is " + volume);
    }
}