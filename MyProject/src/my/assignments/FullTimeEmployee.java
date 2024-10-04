package my.assignments;

public class FullTimeEmployee extends EmployeeAbstract
{
	private double paymentday;
	public FullTimeEmployee(String name, int id,double paymentperday) {
		super(name, id);
		this.paymentday= paymentperday;

	}
	
	public static void main(String[] args) 
	{
		  Contractor contractor = new Contractor("Salu", 1001, 100, 40); // 100 per hour, 40 hours worked
		  contractor.employeeDetails();
	        System.out.println("Contractor Salary: " + contractor.calculateSalary());
	      
	        // FullTimeEmployee object
	        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Arjun", 1002, 600); // 600 per day
	        fullTimeEmployee.employeeDetails();
	        System.out.println("Full Time Employee Salary: " + fullTimeEmployee.calculateSalary());
	}
	@Override
	public double calculateSalary() {
		 return paymentday * 8;
	}
	
	

}
