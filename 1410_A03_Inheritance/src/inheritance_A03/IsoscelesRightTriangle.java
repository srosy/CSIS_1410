/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A03_Inheritance
 * Course: CSIS 1410
 *****************************/

package inheritance_A03;

/**
 * Creates Isoscles Right Trangle Objects
 * 
 * @author SpencerR
 *
 */
public class IsoscelesRightTriangle {

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
}
