package com.grueff.more_threading;

public class Application {
	
//	GetNext is not thread-safe
	
	public static void main(String args[]) {
		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);
		Worker worker2 = new Worker(sequence);
		
		worker1.start();
		worker2.start();
		
	}

}

class Worker extends Thread{
	Sequence sequence = null;
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i = 0; i<199; i++) {
			System.out.println(Thread.currentThread().getName() + " got value " + sequence.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("can't sleep");
//				e.printStackTrace();
			}
		}

		
	}
}
