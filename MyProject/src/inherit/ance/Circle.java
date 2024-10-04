package inherit.ance;

public class Circle extends Shapes{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.findArea();
	}
	public void findArea() {
		double p = 3.14;
		int r = 6;
		System.out.println("Steps to find area circle");
		double circleArea = p * (r * r);
		System.out.println("Area of circle is : " +circleArea );
	}

}
