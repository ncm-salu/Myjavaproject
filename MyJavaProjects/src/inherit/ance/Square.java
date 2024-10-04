package inherit.ance;

public class Square extends Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		s.findArea();
	}
	public void findArea() {
		
		int a = 6;
		System.out.println("Steps to find area square");
		int squareArea = a * a;
		System.out.println("Area of square is : " +squareArea );
	}
}
