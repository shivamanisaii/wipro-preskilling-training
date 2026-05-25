package com.wipro.Day_seven;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        List<Item> cart = new ArrayList<Item>();

        Item i1 = new Item();
        i1.setProductName("Laptop");
        i1.setPrice(75000.0);

        Item i2 = new Item();
        i2.setProductName("Mouse");
        i2.setPrice(1200.0);

        Item i3 = new Item();
        i3.setProductName("Keyboard");
        i3.setPrice(2500.0);

        Item i4 = new Item();
        i4.setProductName("Mouse");
        i4.setPrice(1200.0);

        cart.add(i1);
        cart.add(i2);
        cart.add(i3);
        cart.add(i4);

        System.out.println("Items in Cart:");
        for (Item obj : cart) {
            System.out.println("\nProduct: " + obj.getProductName() + "\nPrice: " + obj.getPrice());
        }

        cart.remove(i3);
        System.out.println("\nAfter Removing Keyboard- ");

        double totalBill = 0;
        for (Item obj : cart) {
            totalBill += obj.getPrice();
            System.out.println("Item: " + obj.getProductName() + " - Price: " + obj.getPrice());
        }

        System.out.println("\nTotal Items: " + cart.size());
        System.out.println("Total Amount to Pay: " + totalBill);
    }
}