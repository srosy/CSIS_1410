/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A04_Interface
 * Course: CSIS 1410
 *****************************/

package a04_interface;

/**
 * extends Class Rectangle and creates Square objects
 * 
 * @author SpencerR
 *
 */
public class Square extends Rectangle implements Shape, Printable {

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
