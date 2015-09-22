package com.hungtdo.demo.javase;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoExecutorService3 {

	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	int b = 4/0;
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	// int b = 4/0;
		    	for (int i = 0; i < 100; i++) {
					Thread.sleep(200);
				}
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});
		
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	int b = 4/2;
		        return "Task 2: " + b;
		    }
		});

		try {
			String result = executorService.invokeAny(callables);
			System.out.println("result = " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		executorService.shutdown();
	}

}
