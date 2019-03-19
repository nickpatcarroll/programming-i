package lab7;
public class Circle {
			// Instance variables
			double radius;
			double area;
			double perimeter;
			double pi = 3.14159;
			
			// Circle constructor
			Circle() {
				radius = 0;
				area = 0;
				perimeter = 0;
			}
			
			// Methods that perform calculations
			public double getRadius(double radius) {
				return this.radius = radius;
			}
			public double getArea(double area, double radius, double pi) {
				return radius * radius * pi;
			}
			public double getPerimeter(double perimeter, double pi, double radius) {
				return 2 * pi * radius;
			}
}


