public class Demo {

    public static void main(String args[]) {

        B obj = new B();
    }
}

class A {

    public A(int x) {

        System.out.println("Initialized A constructor");
    }
}

class B extends A {

    public B() {

        super(3);

        System.out.println("Initialized B Constructor");
    }
}