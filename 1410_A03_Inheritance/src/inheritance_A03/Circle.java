/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A03_Inheritance
 * Course: CSIS 1410
 *****************************/

package inheritance_A03;

/**
 * Creates circle objects.
 * 
 * @author SpencerR
 *
 */
public class Circle {
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
	 * returns String of Format: "Circle({raidus}).
	 */
	@Override
	public String toString() {
		return "Circle(" + radius + ")";
	}

}
