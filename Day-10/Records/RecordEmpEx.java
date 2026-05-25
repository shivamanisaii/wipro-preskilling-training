package com.wipro.Day_ten;

public class RecordEmpEx {
	public static void main(String[] args) {
		Employee e1 = new Employee(26, "Shiva Mani Sai", 40000);

		System.out.println("\nEmp Name -  "+e1.name() + " \nSalary - " + e1.salary() + "\nEmp ID -  " + e1.eid());
	
	}
		
}


record Employee(int eid, String name, int salary) {

}
