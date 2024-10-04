package my.assignments;

public class Contractor extends EmployeeAbstract {
	 private double paymentperhr;
	 private int workinghr;
	 
	public Contractor(String name, int id,double payment, int workhour)
	{
		 super(name, id);
		 this.paymentperhr = payment;
	     this.workinghr = workhour;
	}

	@Override
	public double calculateSalary() {
		 return paymentperhr * workinghr;
	}

	
}
