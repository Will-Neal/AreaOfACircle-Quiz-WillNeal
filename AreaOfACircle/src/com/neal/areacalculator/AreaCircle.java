package com.neal.areacalculator;

public class AreaCircle {
	
	static double area;
	static double radius = 2.00;
	final static double PI = 3.14;
	
	public static void main(String[] args) {
		calcAreaOfCitcle(radius, PI);
		displayArea();
	}
	
	public static void calcAreaOfCitcle(double radius, double pi) {
		area = pi * (radius * radius);
	}
	
	public static void displayArea() {
		System.out.println(area);
	}

}
