package day4and5;

public class Rectangle extends Shape{

	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	double area() {
		return length*breadth;
		
	}

}
