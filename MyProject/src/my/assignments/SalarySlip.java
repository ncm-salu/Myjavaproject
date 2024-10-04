package my.assignments;

public class SalarySlip extends SalaryComponents {

	 double totalSalary;
	 public static void main(String[] args) {
			  SalarySlip slip = new SalarySlip();
		        slip.displaySalarySlip();
	 }
	    public SalarySlip() {
	        // Calculate total salary
	        totalSalary = (basicPay + hra + bonus) - (pf + deduction);
	    }

	    public void displaySalarySlip() {
	        // Display the salary slip
	        System.out.println("\n----- Salary Slip -----");
	        System.out.println("Basic Pay    : " + basicPay);
	        System.out.println("HRA (5%)     : " + hra);
	        System.out.println("PF (20%)     : " + pf);
	        System.out.println("Deduction    : " + deduction);
	        System.out.println("Bonus        : " + bonus);
	        System.out.println("Total Salary : " + totalSalary);
	    }
}
