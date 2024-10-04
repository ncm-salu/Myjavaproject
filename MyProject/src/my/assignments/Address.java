package my.assignments;
public class Address {
   String address;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating a Student object
       
        
        Address address1 = new Address();
       address1.address="Thrissur";
        // Print details of the student
       address1.studentDetails();
	}
	void studentDetails()
	{
		 StudentDetails student1 = new StudentDetails();
	        student1.setName("salu");
	        student1.setRollNumber(111);
	        System.out.println(" Student Name : " +student1.getName()+"\n"+ " Student RollNumber : " + student1.getRollNumber()+"\n"+ " Student Address : "+address);
	}
	
}
