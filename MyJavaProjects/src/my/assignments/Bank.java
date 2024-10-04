package my.assignments;

public class Bank {
	    private int pin;  

	    // Method to set the pin
	    public void setPin(int pin) {
	        this.pin = pin;
	    }

	    public boolean checkPin() {
	        int[] pinlist = {1001, 1234, 1212}; 
	        for (int validPin : pinlist) {
	            if (pin == validPin) {
	                return true;  // pin is valid
	            }
	        }
	        return false;  // invalid pin
	    }
   
	    // withdraw amount
	    public void withdraw(double amount) 
	    {
	        if (checkPin()) {
	            System.out.println("PIN is correct. Withdrawal of Rs : " + amount + " is successful.");
	        }
	        else
	        {
	            System.out.println("Incorrect PIN number . Try Again ");
	        }
	    
	}

	
}
