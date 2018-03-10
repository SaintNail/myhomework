package com.gmail.saintnail;

public class Main {

	public static void main(String[] args) {

		Car carOne = new Car();
		carOne.setColor("Green");
		carOne.setWeight(2000);
		carOne.setYear(1988);
        carOne.beep();
		
		Car carTwo = new Car("Red", 1500, 2010);
System.out.println(carOne);
System.out.println(carTwo);
		
     int age = carOne.getYear();
     System.out.println(age);
	}

}
