package com.wipro.Day_nine;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain_two {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);

		for (int i = 1; i <= 10; i++) {
			int num = i;
			service.submit(() -> System.out.println("Task : " + num + " " + Thread.currentThread().getName()));
		}

		service.shutdown();
	}

}