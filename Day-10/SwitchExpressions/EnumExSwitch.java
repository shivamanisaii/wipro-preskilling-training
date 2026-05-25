package com.wipro.Day_ten;

public enum EnumExSwitch {

    SUCCESS, FAILURE, PENDING;

    public static void main(String[] args) {

        EnumExSwitch input = EnumExSwitch.SUCCESS; 
        
        String result = switch (input) {
            case SUCCESS -> "Success";
            case FAILURE -> "Error: Process halted.";
            case PENDING -> "Wait: Process is still running.";
        };

        System.out.println("Input provided: " + input);
        System.out.println("Result: " + result);
    }
}