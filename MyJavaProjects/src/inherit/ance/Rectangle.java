package inherit.ance;

public class Rectangle extends Shapes{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.findArea();
	}
public void findArea() {
		
		int l = 6;
		int w = 4;
		System.out.println("Steps to find area rectangle");
		int rectangleArea = l * w ;
		System.out.println("Area of rectangle is : " + rectangleArea);
	}
}
