package com.wipro.Day_ten;

public class RecordStdEx {
	public static void main(String[] args) {

		Student s1 = new Student("sakshi", 12);
		Student s2 = new Student("xYZ", 13);

		System.out.println(s1.name() + " - " + s1.rollno());
		System.out.println(s2.name() + " - " + s2.rollno());
		s1.display();
	
	}
}

record Student(String name, int rollno) {
	void display() {
		System.out.println("working.");
	}
}



