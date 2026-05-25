package com.wipro.Day_nine;

public class ThreadClassMain extends  Thread{

	public static void main(String[] args) {
		
		
		ThreadClassMain d1=new ThreadClassMain();  //creating a thread1
		  d1.setName("thread_1");
		  d1.start(); // starting a thread 1
		  ThreadClassMain d2=new ThreadClassMain();  //creating a thread2
		  d2.setName("thread_2");
		  d2.start(); // starting a thread 2
		  ThreadClassMain d3=new ThreadClassMain();
		  d3.setName("thread_3");
		  d3.start();

	}
	
	void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i)+" - "+currentThread().getName());
			
		}
	}
	
	
	
	public void run()   // running the thread
	{
		
		printTable(3);
	}

}