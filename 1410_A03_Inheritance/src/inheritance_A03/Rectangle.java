/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A03_Inheritance
 * Course: CSIS 1410
 *****************************/

package inheritance_A03;

/**
 * Creates a rectangle object
 * 
 * @author SpencerR
 *
 */
public class Rectangle {
	private int length;
	private int width;

	/**
	 * Initializes fields length and width.
	 * 
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * returns length.
	 * 
	 * @return
	 */
	public int getLength() {
		return length;
	}

	/**
	 * returns width.
	 * 
	 * @return
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * returns Rectangle length and width in Format: Rectangle({length}x{width})
	 */
	@Override
	public String toString() {
		return "Rectangle(" + length + "x" + width + ")";
	}
}
