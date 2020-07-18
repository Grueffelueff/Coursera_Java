package com.grueff.threading;

public class Application {
	public static void main(String args[]) {
		
		System.out.println("Starting Thread 1");
		Task taskRunner = new Task("Taskrunner1");
		taskRunner.start();
				
		System.out.println("Starting Thread 2");
		Task taskRunner2 = new Task("GetShitDone");
		taskRunner2.start();
		
	}
}

class Task extends Thread {
	String name;
	
	
	public Task(String name) {
		super();
		this.name = name;
	}


	public void run() {
		Thread.currentThread().setName(name);
		for(int i = 0; i<1000; i++) {
			System.out.println("Number " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
//				e.printStackTrace();
			}
		}
	}
}
