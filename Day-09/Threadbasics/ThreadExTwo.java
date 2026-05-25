package com.wipro.Day_nine;


public class ThreadExTwo{
	public static void main(String[] args) {
		Table Tabletask=new Table(5);
		Thread T1 =new Thread(Tabletask);
		
		T1.start();
	}
}

class Table implements Runnable{
	int y;
	Table(int y){

		this.y=y;
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(y*i);
		}
	}
}

