package Demo_code;
import java.io.*;
public class Circle {
	
	static final double PI = Math.PI;

	// Overloaded Area() function to
	// calculate the area of the circle.
	// It takes one double parameter
	void Area(double r)
	{
		double A = PI * r * r;

		System.out.println("Area of the circle is :" + A);
	}
	void Area(float r)
	{
		double A = PI * r * r;

		System.out.println("Area of the circle is :" + A);
	}
}
class AOC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle();
		obj.Area(5);
		obj.Area(2.5);
	}

}
