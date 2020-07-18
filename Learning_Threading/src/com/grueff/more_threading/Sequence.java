package com.grueff.more_threading;

public class Sequence {
	
	private int value = 0;
	
	public int getNext() {
		synchronized (this) {
			value++;
			return value;
		}
	}

}
