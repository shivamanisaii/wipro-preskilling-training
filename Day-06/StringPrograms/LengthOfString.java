package com.wpiro.Day_six;
import java.util.Scanner;

public class LengthOfString{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        LengthOfString sl = new LengthOfString();
        int result = sl.getLength(input);

        System.out.println(result);
        sc.close();
    }


    public int getLength(String str) {
        if (str == null) return 0;
        return str.length();
    }

}