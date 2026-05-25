package com.wipro.Day_ten;

public class RecordShapeEx {
	public static void main(String[] args) {
		Shape obj = new Shape();

		obj.area(3);
	}

}
record Shape() {

	void area(int x) {
		System.out.println(x * x);
	}
}
