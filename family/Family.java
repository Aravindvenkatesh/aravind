package family;

import java.util.List;

public class Family {
	private int Rationid;
	private List<FamilyMembers> familyMembers;
	private String economy;
	private Address address;
	public int getRationid() {
		return Rationid;
	}
	public void setRationid(int rationid) {
		Rationid = rationid;
	}
	public List<FamilyMembers> getFamilyMembers() {
		return familyMembers;
	}
	public void setFamilyMembers(List<FamilyMembers> familyMembers) {
		this.familyMembers = familyMembers;
	}
	public String getEconomy() {
		return economy;
	}
	public void setEconomy(String employe) {
		this.economy = employe;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Family [Rationid=" + Rationid + ", familyMembers=" + familyMembers + ", economy=" + economy
				+ ", address=" + address + "]";
	}
	
	
	

}
