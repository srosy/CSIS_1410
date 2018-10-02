/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A04_Interface
 * Course: CSIS 1410
 *****************************/

package a04_interface;

/**
 * Creates circle objects.
 * 
 * @author SpencerR
 *
 */
public class Circle implements Shape {
	private int radius;

	/**
	 * initializes field radius.
	 * 
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	/**
	 * calculates and returns diameter from radius.
	 * 
	 * @return
	 */
	public int diameter() {
		return radius * 2;
	}

	/**
	 * calculates and returns circumference from radius and formula circumference =
	 * 2piR
	 * 
	 * @return
	 */
	public double circumference() {
		return (Math.rint(radius * 2 * Math.PI * 10)) / 10; // promote to double because pi = 3.14
	}

	/**
	 * returns radius.
	 * 
	 * @return
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * returns String of Format: "Circle({radius})"
	 */
	@Override
	public String toString() {
		return "Circle(" + radius + ")";
	}

	/**
	 * returns perimeter of class object
	 */
	@Override
	public double perimeter() {
		return circumference(); // circumference is the parameter for a circle
	}

	/**
	 * returns area of class object
	 */
	@Override
	public double area() {
		// (Math.rint(radius * 2 * Math.PI * 10)) / 10;
		return Math.rint(Math.pow((radius), 2) * Math.PI * 10) / 10; // area = pi*R^2, returns rounded to 1 decimal
	}
}
