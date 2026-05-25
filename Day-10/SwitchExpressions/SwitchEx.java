package com.wipro.Day_ten;

public class SwitchEx {

	public static void main(String[] args) {
		SwitchEx obj=new SwitchEx();
		System.out.println("Switch 1 Executing");
		obj.Switch1();
		System.out.println("Switch 2 is Executing");
		obj.Switch2();

	}

	void Switch1() {
		int day = 2;
		String result = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 7 -> "Sunday";
		default -> "Inavlid";
		};

		System.out.println(result);
	}
	
	

	void Switch2() {
		int day = 2;
		String result = switch (day) {
		case 1, 2, 3, 4, 5 -> "Week days";
		case 6, 7 -> "Weekend";
		default -> "Inavlid";
		};

		System.out.println(result);
	}
	
}
