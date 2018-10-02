/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A04_Interface
 * Course: CSIS 1410
 *****************************/

package a04_interface;

/**
 * Tests class functionality
 * 
 * @author SpencerR
 *
 */
public class InterfaceApp {

	/**
	 * runs program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Shape[] shapeArray = new Shape[8]; // create shape array
		shapeArray[0] = new Rectangle(6, 3);
		shapeArray[1] = new Rectangle(5, 4);
		shapeArray[2] = new Square(4);
		shapeArray[3] = new Square(3);
		shapeArray[4] = new IsoscelesRightTriangle(5);
		shapeArray[5] = new IsoscelesRightTriangle(3);
		shapeArray[6] = new Circle(7);
		shapeArray[7] = new Circle(2);

		System.out.println("Shape Array: ");
		System.out.println("------------");

		for (Shape shape : shapeArray) {
			System.out.println(shape.toString()); // get name of shape
			System.out.println("Perimeter: " + shape.perimeter()); // print perimeter of shape
			System.out.println("Area: " + shape.area()); // print area of shape

			if (shape instanceof Printable) {
				((Printable) shape).print();
				System.out.println();
			}
			System.out.println();
		}
	}
}
