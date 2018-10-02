/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A04_Interface
 * Course: CSIS 1410
 *****************************/

package a04_interface;

/**
 * Creates Isoscles Right Trangle Objects
 * 
 * @author SpencerR
 *
 */
public class IsoscelesRightTriangle implements Shape, Printable {

	private final int leg; // leg of triangle

	/**
	 * initializes leg.
	 * 
	 * @param leg
	 */
	public IsoscelesRightTriangle(int leg) {
		this.leg = leg;
	}

	/**
	 * calculates and returns hypotenuse from provided x and y values.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double hypotenuse(int x, int y) {
		return Math.rint((Math.hypot(x, y)) * 10) / 10; // returns hypotenuse value rounded
	}

	/**
	 * returns leg.
	 * 
	 * @return
	 */
	public int getLeg() {
		return leg;
	}

	/**
	 * returns String in Format: IscocelesRightTriangle({leg}).
	 */
	@Override
	public String toString() {
		return "IsoscelesRightTriangle(" + leg + ")";
	}

	/**
	 * prints shape of this class object
	 */
	@Override
	public void print() {
		System.out.println("o");
		for (int i = 0; i < getLeg() - 1; i++) {
			System.out.print("o");
			if (i < 1) {
				for (int j = 0; j <= i; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j <= i * 2; j++) {
					if (i == getLeg() - 2) {
						System.out.print(" o");
						j += 1;
					} else {
						System.out.print(" ");
					}
				}
			}
			if (i != getLeg() - 2) {
				System.out.println("o");
			}
		}
	}

	/**
	 * calculates and returns perimeter of class object
	 */
	@Override
	public double perimeter() {
		return (2 * getLeg()) + hypotenuse(getLeg(), getLeg()); // calculates perimeter by multiplying two legs of right
																// triangle (equal
		// length) and adding the length of the hypotenuse to complete the
		// triangle
	}

	/**
	 * returns area of class object
	 */
	@Override
	public double area() {
		return .5 * Math.pow(getLeg(), 2); // 1/2 * base * height = area of triangle
	}
}
