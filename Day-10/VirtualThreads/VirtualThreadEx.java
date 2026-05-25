package com.wipro.Day_ten;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadEx {

	public static void main(String[] args) {
	
		Runnable task = () -> System.out.println("hello thread is working!");
		
		Thread vt = Thread.ofVirtual().start(task);
		
		for (int i = 1; i <= 10; i++) {
			int currentI = i; 
			Thread.ofVirtual().start(
				() -> System.out.println("New virtual thread is created!" + currentI)
			);
		}
		
		try (ExecutorService service = Executors.newVirtualThreadPerTaskExecutor()) {
			service.submit(() -> System.out.println("Task running in executor service"));
		}
	}
}