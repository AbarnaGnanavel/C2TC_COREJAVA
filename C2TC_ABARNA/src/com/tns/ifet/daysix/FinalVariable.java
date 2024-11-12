package com.tns.ifet.daysix;

public class FinalVariable {
	final int x = 100;

	static final int Y = 0;

	// Declare & intialize static final variable.
	final static int Z = 10;

	// instatnce method
	void change() {
	    @SuppressWarnings("unused")
		int x = 30; // final variables can't be reassigned
		@SuppressWarnings("unused")
		int y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		int Y = 20;
		@SuppressWarnings("unused")
		int Z = 100; 
		System.out.println("Value of Y: " + Y);
		
	}

}
