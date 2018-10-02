/*****************************
 * Author: Spencer Rosenvall
 * Assignment: A03_Inheritance
 * Course: CSIS 1410
 *****************************/

package inheritance_A03;

/**
 * Tests class functionality
 * 
 * @author SpencerR
 *
 */
public class InheritanceApp {

	/**
	 * runs program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Object[] objectArray = new Object[4];
		objectArray[0] = new Rectangle(5, 4);
		objectArray[1] = new Square(4);
		objectArray[2] = new IsoscelesRightTriangle(5);
		objectArray[3] = new Circle(4);

		runLoop(objectArray);

		Rectangle rectangle2 = ((Rectangle) objectArray[1]); // cast from type Object to Rectangle
		System.out.println("rectangle2: ");
		System.out.println("-----------");
		System.out.println(rectangle2);
		System.out.println("Length: " + rectangle2.getLength());
		System.out.println("Width: " + rectangle2.getWidth());
		System.out.println();

		System.out.println("Rectangle Array: ");
		System.out.println("----------------");

		Square mySquare = ((Square) objectArray[1]);
		Rectangle myRectangle = ((Rectangle) objectArray[0]);

		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = rectangle2;
		rectangles[1] = mySquare;
		rectangles[2] = myRectangle;

		runLoop(rectangles);

	}

	/**
	 * runs a for loop for Objects, also prints Name, length and width.
	 * 
	 * @param objectArray
	 */
	private static void runLoop(Object[] objectArray) {
		for (Object shape : objectArray) {

			System.out.println(shape);

			if (shape instanceof Rectangle) {
				if (shape instanceof Square) {
				} else {
					System.out.println("Length: " + ((Rectangle) shape).getLength());
					System.out.println("Width: " + ((Rectangle) shape).getWidth());
					System.out.println();
				}
			}

			if (shape instanceof Square) {
				System.out.println("Side: " + ((Square) shape).getSide());
				System.out.println();
			}

			if (shape instanceof IsoscelesRightTriangle) {
				System.out.println("Leg: " + ((IsoscelesRightTriangle) shape).getLeg());
				// x = leg, y = leg, properties of right triangle
				System.out.println("Hypotenuse: " + ((IsoscelesRightTriangle) shape).hypotenuse(
						((IsoscelesRightTriangle) shape).getLeg(), ((IsoscelesRightTriangle) shape).getLeg()));
				System.out.println();
			}

			if (shape instanceof Circle) {
				System.out.println("Diameter: " + ((Circle) shape).diameter());
				System.out.println("Circumference: " + ((Circle) shape).circumference());
				System.out.println("Radius: " + ((Circle) shape).getRadius());
				System.out.println();
			}
		}
	}

	/**
	 * runs for loop for Rectangles, returns Name, Length and Width.
	 * 
	 * @param rectangles
	 */
	private static void runLoop(Rectangle[] rectangles) {
		for (Object shape : rectangles) {
			System.out.println(shape);

			if (shape instanceof Rectangle) {
				System.out.println("Length: " + ((Rectangle) shape).getLength());
				System.out.println("Width: " + ((Rectangle) shape).getWidth());
				System.out.println();
			}
		}
	}
}
