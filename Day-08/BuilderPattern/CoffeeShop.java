package com.wipro.Day_eight;

public class CoffeeShop {
    public static void main(String[] args) {
        
        Coffee myOrder = new PlainCoffee();
        myOrder = new Milk(myOrder);
        myOrder = new Caramel(myOrder);

        System.out.println("Order Summary: \n" + myOrder.getDescription());
        System.out.println("Total Price: " + myOrder.cost());
    }
}

interface Coffee {
    String getDescription();
    int cost();
}

class PlainCoffee implements Coffee {
    public String getDescription() {
        return "Espresso";
    }
    public int cost() {
        return 50;
    }
}

abstract class CoffeeAddOns implements Coffee {
    protected Coffee coffee;

    CoffeeAddOns(Coffee coffee) {
        this.coffee = coffee;
    }
}

class Milk extends CoffeeAddOns {
    Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    public int cost() {
        return coffee.cost() + 10;
    }
}

class Sugar extends CoffeeAddOns {
    Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }

    public int cost() {
        return coffee.cost() + 5;
    }
}

class Caramel extends CoffeeAddOns {
    Caramel(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + " + Caramel Syrup";
    }

    public int cost() {
        return coffee.cost() + 20;
    }
}
