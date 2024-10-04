package pkg.one;

public class DivisibleCheck extends Addition {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DivisibleCheck c = new DivisibleCheck();

	        c.addNumbersAndDivision(15,5);
	        c.addNumbersAndDivision(20,12);
	}
@Override
//here return method in parent so child method also give as return method
	 public int addNumbersAndDivision(int num1, int num2)
	 {
	//call parent class method using super
	        int sum = super.addNumbersAndDivision(num1, num2);
	        if (sum % 10 == 0) 
	        {
	            System.out.println("The sum of " + sum + " is divisible by 10.");
	        }
	        else
	        {
	            System.out.println("The sum of " + sum + " is not divisible by 10.");
	        }
	//just return a dummy value
	        return 0;
	 }
	

}
