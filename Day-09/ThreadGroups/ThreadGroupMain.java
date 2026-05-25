package com.wipro.Day_nine;
public class ThreadGroupMain {
	public static void main(String[] args) {
		ThreadGroup group1=new ThreadGroup("Group 1");
		ThreadGroup group2=new ThreadGroup("Group 2");
		ThreadGroup group3=new ThreadGroup("Group 3");
		ThreadGroup group4=new ThreadGroup("Group 4");
		
		Thread object1=new Thread(group1,
				()-> System.out.println("Thread 1 is working " + Thread.currentThread().getThreadGroup().getName())
				
				);
		Thread object2=new Thread(group2,
				()-> System.out.println("Thread 2 is working " + Thread.currentThread().getThreadGroup().getName())
						
				);
		Thread object3=new Thread(group3,
				()-> System.out.println("Thread 3 is working " + Thread.currentThread().getThreadGroup().getName())
						
				);
		Thread object4=new Thread(group4,
				()-> System.out.println("Thread 4 is working "));

		object1.setPriority(Thread.MAX_PRIORITY);
		object2.start();
		object3.start();
		object4.start();
	}

}
