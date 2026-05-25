package Day-04.InterfacePrograms;

interface Payment {

    void pay(double amount);
}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

class Cash implements Payment {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " in Cash.");
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment p;

        p = new CreditCard();
        p.pay(5000);

        p = new UPI();
        p.pay(1200);

        p = new Cash();
        p.pay(50);
    }
}
