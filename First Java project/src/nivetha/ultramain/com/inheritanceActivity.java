package nivetha. ultramain.com;

	 public class inheritanceActivity
	 {

	  public static void main(String args[])
	  {
	   Manager m1 = new Manager(126534," peter","ChennaiIndia",237844,65000);
		  m1.calculateSalary(m1.basicsalary);
		  m1.calculateTransportAllowance();
		  
         Trainee t1 = new Trainee(29846,"Jack","MumbaiIndia",442085,45000);
          t1.calculateSalary(t1.basicsalary);
         t1.calculateTransportAllowance();
	  }
} 


