package com.wipro.Day_seven;

import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        
        Student s1 = new Student();
        s1.setName("Shiva");
        s1.setMarks(85);
        
        Student s2 = new Student();
        s2.setName("Harshini");
        s2.setMarks(92);
        
        Student s3 = new Student();
        s3.setName("Baka");
        s3.setMarks(78);
        
        Student s4 = new Student();
        s4.setName("Sahith");
        s4.setMarks(98);
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Student hStudent = students.get(0);
        Student lStudent = students.get(0);
        int totalSum = 0;

        for (Student obj : students) {
            totalSum += obj.getMarks();

            if (obj.getMarks() > hStudent.getMarks()) {
                hStudent = obj;
            }

            if (obj.getMarks() < lStudent.getMarks()) {
                lStudent = obj;
            }

            System.out.println("\nName: " + obj.getName() + "\nMarks: " + obj.getMarks());
        }

        double average = (double) totalSum / students.size();

        System.out.println("Highest Scorer: " + hStudent.getName() + " (" + hStudent.getMarks() + ")");
        System.out.println("Lowest Scorer: " + lStudent.getName() + " (" + lStudent.getMarks() + ")");
        System.out.println("Class Average: " + average);
    }
}