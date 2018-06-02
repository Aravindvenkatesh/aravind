package family;

import java.util.ArrayList;
import java.util.List;

public class Rationcard {
	
	public static void main(String[] args ) {
		Family familyone=new Family();
		FamilyMembers familymembersone=new FamilyMembers();
		familyone.setRationid(123);
		familymembersone.setName("Aravind");
		familymembersone.setDob("14/10/1997");
		familymembersone.setAge(21);
		familymembersone.setGender("male");
		
		
		
		FamilyMembers familymemberstwo=new FamilyMembers();
		familymemberstwo.setName("Vinay");
		familymemberstwo.setDob("10/5/1997");
		familymemberstwo.setAge(21);
		familymemberstwo.setGender("male");
		
		
		List<FamilyMembers> familyMembersList=new ArrayList();
		familyMembersList.add(familymembersone);
		familyMembersList.add(familymemberstwo);
		
		
		familyone.setFamilyMembers(familyMembersList);
		familyone.setEconomy("rich");
		
		Address address = new Address();
		address.setDoorNum("1/354");
		address.setCityName("Hosur");
		address.setStreetName("Jonabanda");
		address.setPincode(635109);
		familyone.setAddress(address);
		
		System.out.println(familyone.toString());
	}

}
