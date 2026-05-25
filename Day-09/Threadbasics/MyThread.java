package com.wipro.Day_nine;

class MyThread extends Thread {

	
	public int Square(int x) {
//		System.out.println(x*x);
		return x*x;
	}
	
	
	
	public void run() {
//		Square(3);
		System.out.println(Square(3));

	}

}
