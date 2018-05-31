package Employe;

public class Employe {

	String firstname;
	String lastname;
	double salary;
	public String getFirstname(String a) 
	{
		firstname="Firstname is"+a;
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname(String b)
	{
		lastname="Lastname is"+b;
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getSalary(double i) {
		if(i>0) {
			double salary=10*i;
			double sal=salary;
			double yearly=(salary/10)+sal;
			double yearlysalary=yearly;
			return yearlysalary;
			
		}
		else
		{
			return 0;
		}
	
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void main(String args[]) {
		Employe e1=new Employe();
		Employe e2=new Employe();
		String f1=e1.getFirstname("vinay");
		System.out.println(f1);
		String f2=e2.getFirstname("rami");
		System.out.println(f2);
		String l1=e1.getLastname("rini");
		System.out.println(l1);
		String l2=e2.getLastname("selva");
		double s1=e1.getSalary(2000.0);
		System.out.println(l2);
		double s2=e2.getSalary(2500.0);
		System.out.println(s1);
		System.out.println(s2);
	
	}
		  
}
	 
	 

