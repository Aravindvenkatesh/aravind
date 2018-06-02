package studentdata;

public class Student {
   public static void main(String[] args) {
	   
	StudentData studentone=new StudentData();
	studentone.setId(123);
	studentone.setFirstname("Aravind");
	studentone.setLastname("Kumar");
	studentone.setGender("male");
	studentone.setBranch("B-Tech");
	studentone.setDept("IT");
	System.out.println(studentone.toString());
	
	StudentData studenttwo=new StudentData();
	studenttwo.setId(345);
	studenttwo.setFirstname("vinay");
	studenttwo.setLastname("virat");
	studenttwo.setGender("male");
	studenttwo.setBranch("BE");
	studenttwo.setDept("ECE");
	System.out.println(studenttwo.toString());
}
}
