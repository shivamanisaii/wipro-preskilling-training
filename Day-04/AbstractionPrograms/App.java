package Day-04.AbstractionPrograms;

public class App {

    public static void main(String[] args) {

        Mobile m = new Android();
        Phone p = new Iphone();
    }
}

interface Something {

    void calling();
}

interface Phone {

    void calling();
}

interface Mobile extends Phone, Something {

    void camera();
}

class Android implements Mobile {

    public void camera() {
        System.out.println("android camera");
    }

    public void calling() {
        System.out.println("android calling");
    }
}

class Iphone implements Mobile {

    public void camera() {
        System.out.println("iphone camera");
    }

    public void calling() {
        System.out.println("iphone calling");
    }
}