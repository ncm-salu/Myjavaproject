package my.assignments;

public class SalaryComponents extends Employee{

	   double hra;
	   double pf;

	    public  SalaryComponents()
	    { 
	        hra = 0.05 * basicPay;
	        pf = 0.20 * basicPay;
	    }
}
