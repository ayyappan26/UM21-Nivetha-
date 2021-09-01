package nivetha.ultramain.com;

public class Employee
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeephone;
	double basicsalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	double transportAllowance;
	
    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone)
    {
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    	this.employeeAddress = employeeAddress;
    	this.employeephone = employeePhone;
    } 
    public void calculateSalary(double basicSalary)
    {
    	double salary = basicsalary + (basicSalary * specialAllowance/100)+(basicsalary * hra/100);
    	System.out.println(employeeName+" Salary:"+ salary);
    }
     public void calculateTransportAllowance(double basicSalary)
     {
    	 transportAllowance = 10*basicSalary/100;
    	 System.out.println("transport Allowance:+transportAllowance");
     }
}
    class Manager extends Employee
    {
    	public Manager(long id,String name,String address,long phone,double salary)
    	{
    	    //TODO Auto-generated constructor stub
    		
    		super(id,name,address,phone);
    	 	basicsalary = salary;
    	}
     public void calculateTransportAllowance()
    {
    	transportAllowance = 15*basicsalary/100;
    	System.out.println("transportAllowance:" + transportAllowance);
    }
    }
    class Trainee extends Employee
    {
    	public Trainee(long id,String name, String address,long phone,double salary)
    	{
    		//TODO Auto-generated constructor stub
    		super(id,name,address,phone);
    		basicsalary = salary;
    	}	
    	
    	 public void calculateTransportAllowance()
    	 {
    		 super.calculateTransportAllowance(basicsalary);
    	 }
    }	 
    
    		
    		 
    		
    	 
    
  
 
    		
   		
    		



