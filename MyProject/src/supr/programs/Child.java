package supr.programs;

public class Child extends Parent {
int a = 10;
	Child()
	{
	this(1,2);
	System.out.println("child default Constructor");
	}
	Child(int a)
	{
		super(100);
		System.out.println("child param Constructor " +a);
	}
	Child(int b, int c)
	{
		this(1);
		System.out.println("child 2 param Constructor " +b + " " +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.hello();
	}
public void hello() {
	System.out.println("Hello");
}
}
