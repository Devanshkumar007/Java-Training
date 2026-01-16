package Day12_Polymorphism;

abstract class Shape{
	abstract public void calculateArea();
}

class Circle extends Shape{
	double radius ;
	Circle(int r){
		radius = r;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area Circle: "+3.14*radius*radius);
	}
	
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area Rectangle: "+ (length * breadth));
    }
}
class Triangle extends Shape {
	double base, height;
	
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area Triangle: "+ (0.5 *base * height) );
	}
}




public class CalculateArea {
	public static void main(String[] args) {
		Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 8);
        s1.calculateArea();
        s2.calculateArea();
        s3.calculateArea();
	}
}



//Q. Write a Java program to create a base class Shape with a method called calculateArea(). 
//Create three subclasses: Circle, Rectangle, and Triangle.
//Override the calculateArea() method in each subclass to calculate and return the shape's area.