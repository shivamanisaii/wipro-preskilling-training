package Day-03.MethodOverloading;

public class Addition {

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(4, 8);
        obj.add(5.5f, 2.5f);
        obj.add(4, 8, 2);
    }

    void add(int x, int y) {
        System.out.println(x + y);
    }

    void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    void add(float x, float y) {
        System.out.println(x + y);
    }
}
