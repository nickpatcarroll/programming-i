/* Nicholas Carroll			3 December 2018
 * LAB 7: Get radius of a circle using constructors
 */
package lab7;

public class ValuesOfCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		System.out.println("With radius: " + c1.getRadius(20) );
		System.out.printf("The area of the circle is: %.2f %n", c1.getArea(20, 3.14159, 20) );
		System.out.printf("The perimeter of the circle is: %.2f ", c1.getPerimeter(20, 3.14159, 20) );
		

	}

}
