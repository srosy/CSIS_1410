/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A03_Inheritance
 * Course: CSIS 1410
 *****************************/

package inheritance_A03;

/**
 * extends Class Rectangle and creates Square objects
 * 
 * @author SpencerR
 *
 */
public class Square extends Rectangle {

	/**
	 * calls superclass Rectangle constructor and initializes width and length.
	 * 
	 * @param sideLength
	 */
	public Square(int sideLength) {
		super(sideLength, sideLength);
	}

	/**
	 * returns the length of one side.
	 * 
	 * @return
	 */
	public int getSide() {
		return this.getLength(); // might work...
	}

	/**
	 * returns String of Format: Square({side}).
	 */
	@Override
	public String toString() {
		return "Square(" + getSide() + ")";
	}
}
