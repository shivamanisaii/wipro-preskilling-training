package Day-03.MethodOverriding;

public class MobileCamera {

    public static void main(String[] args) {

        Android obj = new Android();
        obj.camera();

        Iphone obj2 = new Iphone();
        obj2.camera();
    }
}

class Mobile {

    void camera() {
        System.out.println("basic camera");
    }
}

class Android extends Mobile {

    void camera() {
        System.out.println("android camera");
    }
}

class Iphone extends Mobile {

    void camera() {
        System.out.println("iphone camera");
    }
}
