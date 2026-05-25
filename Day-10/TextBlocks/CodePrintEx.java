package com.wipro.Day_ten;

public class CodePrintEx {
    public static void main(String[] args) {
    	
        String classTemplate = """
            class PrintCode {
                String name;
                int RollNo;
                
                PrintCode(String name, int RollNo) {
                    this.name = name;
                    this.RollNo = RollNo;
                }
                
                void display() {
                    System.out.println("Name: " + this.name + " Roll: " + this.RollNo);
                }
            }
            """;

        System.out.println("Printing Class Structure:");
        System.out.println(classTemplate);
        
        PrintCode pr = new PrintCode("Shiva Mani Sai", 426);
        pr.display();
    }
}


class PrintCode {
    String name;
    int RollNo;

    PrintCode(String name, int RollNo) {
        this.name = name;
        this.RollNo = RollNo;
    }

    void display() {
        System.out.println("Actual Output "+"\nName: " + this.name + "\nRoll: " + this.RollNo);
    }
}