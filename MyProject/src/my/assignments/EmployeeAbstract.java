package my.assignments;

abstract public class EmployeeAbstract
{
	   String name;
	    int id;

	    public EmployeeAbstract(String name, int id) 
	    {
	        this.name = name;
	        this.id = id;
	    }
public abstract double calculateSalary();
public void employeeDetails()
{

	System.out.println(" Id : "+id + "\t"   + "Name : "+ name);
}
}
