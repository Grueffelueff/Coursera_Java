package com.grueff.threading_with_collections;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		Inventory_manager manager = new Inventory_manager();
		
		Thread inventory_task = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldproducts();
			}
		});
		
		Thread display_task = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProducts();;
			}
		});
		
		inventory_task.start();
//		inventory_task.join(); //join inventory_task with main
		Thread.sleep(2000);
		display_task.start();

	}

}
