package my.assignments;
import java.util.Scanner;
public class User
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     System.out.println("Enter your ATM pin : ");
     Scanner sc = new Scanner(System.in);
     int enterpin = sc.nextInt();
    //bank class object
     Bank bank = new Bank();
     bank.setPin(enterpin);  // Set the user pin
    // amount to withdraw
     System.out.print("Enter amount to withdraw: ");
     double amount = sc.nextDouble();  

     bank.withdraw(amount); 
     sc.close();
	}

}
