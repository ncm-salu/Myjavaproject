package my.assignments;
import java.util.Scanner;
public class Employee
{
	    double basicPay;
	    double deduction;
	    double bonus;
	static Scanner sc = new Scanner(System.in);
	 
	    public Employee() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Details ");
		       System.out.println(" ");
	        System.out.print("Enter Basic Pay: ");
	        basicPay = sc.nextDouble();
	        System.out.print("Enter Deduction: ");
	        deduction = sc.nextDouble();
	        System.out.print("Enter Bonus: ");
	        bonus = sc.nextDouble();
	        sc.close();
	       
	    }


}


