package com.neal.areacalculator;

/**
 * @author will
 * Calculates area of circle and prints result
 */
public class AreaCircle {
	
	static double area;
	static double radius = 4.00;
	final static double PI = 3.14;
	
	public static void main(String[] args) {
		calcAreaOfCircle(radius, PI);
		displayArea();
	}
	
	/**
	 * Takes in radius and PI and assigns the result of the calculation to the area variable
	 */
	public static void calcAreaOfCircle(double radius, double pi) {
		area = pi * (radius * radius);
	}
	
	/**
	 * Prints the area to the console
	 */
	public static void displayArea() {
		System.out.println(area);
	}

}
