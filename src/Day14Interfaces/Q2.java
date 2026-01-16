package Day14Interfaces;

interface Resizable{
	
	void resizeWidth(int width);
	void resizeHeight(int height);
}

class Rectangle implements Resizable{
	
	private int height;
	private int width;
	
	Rectangle(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	
	@Override
	public void resizeWidth(int width) {
		// TODO Auto-generated method stub
		this.width=width;
	}

	@Override
	public void resizeHeight(int height) {
		// TODO Auto-generated method stub
		this.height= height;
	}


	public int getHeight() {
		return height;
	}


	public int getWidth() {
		return width;
	}


	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
}

public class Q2 {
	public static void main(String[] args) {
		Resizable r1 =new Rectangle(20,40);
		System.out.println(r1);
		r1.resizeHeight(60);
		r1.resizeWidth(50);
//		System.out.println(r1.getWidth());
//		System.out.println(r1.getHeight());
		System.out.println(r1);
	}
}


//
//Q.  Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) 
//that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
//
//
//### Explanation:
//
//1. **Resizable Interface:**
//   - The `Resizable` interface is defined with two methods: `resizeWidth(int width)` and `resizeHeight(int height)`.
//
//2. **Rectangle Class:**
//   - The `Rectangle` class implements the `Resizable` interface.
//   - It has private fields `width` and `height` to store the dimensions of the rectangle.
//   - The class constructor initializes these fields.
//   - Getter methods `getWidth()` and `getHeight()` are provided to access the dimensions.
//   - The `resizeWidth` and `resizeHeight` methods are overridden to update the dimensions of the rectangle and print the new dimensions.
//   - The `toPrint` method is to return a string representation of the rectangle's dimensions.
//
//3. **Main Class:**
//   - In the `main` method, a `Rectangle` object is created with initial dimensions.
//   - The initial dimensions are printed.
//   - The `resizeWidth` and `resizeHeight` methods are called to change the dimensions.
//   - The updated dimensions are printed.