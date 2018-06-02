package family;

public class Address {
	private String DoorNum;
	private String StreetName;
	private String cityName;
	private int pincode;
	public String getDoorNum() {
		return DoorNum;
	}
	public void setDoorNum(String doorNum) {
		DoorNum = doorNum;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [DoorNum=" + DoorNum + ", StreetName=" + StreetName + ", cityName=" + cityName + ", pincode="
				+ pincode + "]";
	}
	
	


}
