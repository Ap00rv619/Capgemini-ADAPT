/*
DESCRIPTION
Create an interface named Shape in file with the following abstract methods



getArea() : double ( return type is double)
getPerimeter() : double
Create an abstract class named AbstractShape which implements Shape interface with the below private instance variable



colour:String
create parameterized constructor
Override toString() method to return String as per below format
colour=X
where X represents value of colour variable

Create a concrete subclass of AbstractShape named Rectangle with the below private instance variables





length:int
breadth:int
create constructor with 3 parameters to initialize colour, length and breadth properties of Rectangle in the given sequence
implement the inherited methods getArea and getPerimeter using appropriate formulas for Rectangle[Refer Hints Section]
Override toString to return String as per below format
Rectangle [colour=X, length=X, breadth=X]
where X represent respective values of variables

Create another concrete subclass of AbstractShape named Circle with the below private instance variable



radius:int
create constructor with 2 parameters to initialize colour and radius properties of Circle in the given sequence
implement the inherited methods getArea and getPerimeter using appropriate formulas for Circle[Refer Hints Section]
Override toString to return String as per below format
Circle [colour=X, radius=X]
where X represent respective values of variables

In the class Source, do the following

Create a static method named printShape which should be able to take any shape object as parameter. This method should display the area and perimeter of the input shape object in the below format.



Area: X,Perimeter: X
where X represent the respective values.cThe area and perimeter should be rounded to the nearest integer and displayed

In the main method, do the following



Accept first input as CIRCLE or RECTANGLE.
If first input is CIRCLE, Accept colour and radius
If first input is RECTANGLE, Accept colour, length and breadth
Create object of Circle or Rectangle based on first input and print the details of object.
Call printShape to print the Area and Perimeter.
Note: Use Console to accept input

Refer Example section for Input and output format



Example
Sample Input:
CIRCLE
RED 5

Expected Output:
Circle [colour=RED, radius=5]
Area: 79,Perimeter: 31
Sample Input:
RECTANGLE
GREEN 10 5

Expected Output:
Rectangle [colour=GREEN, length=10, breadth=5]
Area: 50,Perimeter: 30*/

import java.util.Scanner;

interface Shape {
	double getArea();

	double getPerimeter();
}

abstract class AbstractShape implements Shape {
	private String colour;

	AbstractShape(String color) {
		this.colour = color;
	}

	@Override
	public String toString() {
		return ("colour=" + this.colour);
	}

	public String getColour() {
		return colour;
	}
}

class Rectangle extends AbstractShape {
	private int length;
	private int breadth;

	Rectangle(String colour, int len, int bre) {
		super(colour);
		this.length = len;
		this.breadth = bre;
	}

	@Override
	public double getArea() {
		return ((double) this.length * this.breadth);
	}

	@Override
	public double getPerimeter() {
		return ((double) (2 * (this.length + this.breadth)));
	}

	@Override
	public String toString() {
		String result = "Rectangle [colour=" + this.getColour() + ", length=" + this.length + ", breadth="
				+ this.breadth + "]";
		return result;
	}
}

class Circle extends AbstractShape {
	private int radius;

	Circle(String colour, int rad) {
		super(colour);
		this.radius = rad;
	}

	@Override
	public double getArea() {
		return ((double) Math.PI * radius * radius);
	}

	@Override
	public double getPerimeter() {
		return ((double) (2 * Math.PI * radius));
	}

	@Override
	public String toString() {
		String result = "Circle [colour=" + this.getColour() + ", radius=" + this.radius + "]";
		return result;
	}
}

public class Source {
	public static void printShape(AbstractShape abs) {
		System.out.println("Area: " + Math.round(abs.getArea()) + ",Perimeter: " + Math.round(abs.getPerimeter()));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String t = s.nextLine();
		String i[] = s.nextLine().split(" ");
		if (t.equals("CIRCLE")) {
			Circle cir = new Circle(i[0], Integer.parseInt(i[1]));
			printShape(cir);
		} else {
			Rectangle rect = new Rectangle(i[0], Integer.parseInt(i[1]), Integer.parseInt(i[2]));
			printShape(rect);
		}
	}
}
