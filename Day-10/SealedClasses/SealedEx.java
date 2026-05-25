package com.wipro.Day_ten;

public class SealedEx {
	public static void main(String[] args) {
		Entity c = new Circle(5);
		Entity r=new Rectangle(10,4);
		
		
		c.display();
		r.display();
		
	}

}
sealed abstract class Entity permits Circle,Rectangle{
	abstract int calculatedArea();
	
	void display() {
		System.out.println("Area of "+this.getClass().getSimpleName()+" is "+calculatedArea());
	}
}

final class Circle extends Entity{
	final int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	int calculatedArea() {
		return (22/7)*radius*radius;
	}
}

final class Rectangle extends Entity{
	final int length, breadth;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	int calculatedArea() {
		return length*breadth;
	}
}