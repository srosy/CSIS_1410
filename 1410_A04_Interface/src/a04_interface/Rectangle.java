/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A04_Interface
 * Course: CSIS 1410
 *****************************/

package a04_interface;

/**
 * Creates a rectangle object
 * 
 * @author SpencerR
 *
 */
public class Rectangle implements Shape, Printable {
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

	/**
	 * prints shape of this class object
	 */
	@Override
	public void print() {
		for (int i = 0; i < getLength(); i++) {
			System.out.print("o ");
		}
		System.out.println();

		for (int i = 1; i < getWidth() - 1; i++) {
			System.out.print("o ");
			for (int j = 0; j < getLength() - 2; j++) {
				System.out.print("  ");
			}
			System.out.println("o");
		}

		for (int i = 0; i < getLength(); i++) {
			System.out.print("o ");
		}
	}

	/**
	 * returns perimeter of class object
	 */
	@Override
	public double perimeter() {
		return 2 * (getWidth() + getLength()); // perimeter of rectangle = 2*L+W
	}

	/**
	 * returns area of class object
	 */
	@Override
	public double area() {
		return getLength() * getWidth(); // area = L*W
	}
}
