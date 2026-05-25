package com.wpiro.Day_six;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        ReverseString rs = new ReverseString();
        String result = rs.reverseString(input);

        System.out.println("Reversed string: " + result);
        sc.close();
    }

    public String reverseString(String str) {
        if (str == null) return null;
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }


}
