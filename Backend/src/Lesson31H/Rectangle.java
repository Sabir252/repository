package Lesson31H;

public class Rectangle implements Shape{
	private double width, heigth;
	public Rectangle(double width, double height) {
		this.width = width;
		this.heigth = height;
	}
	public double area() {
		return width * heigth;
	}
}
