package abstraction.programs;

public class ChildAbstract extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentAbstract p = new ChildAbstract(); //can only access parent methods
		ChildAbstract ch = new ChildAbstract();
		ch.hy();
		p.details(); // or ch.details();
		p.printHello();
		ch.printMyDetails();
		p.printPlace();

	}

	void printMyDetails()
	{
		System.out.println("My name is Salu");
	}
	@Override
	void printHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello Everyone");
	}

	@Override
	void printPlace() {
		// TODO Auto-generated method stub
		System.out.println("I am from thrissur");
	}

}
