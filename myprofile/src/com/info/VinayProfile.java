package com.info;

public class VinayProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstance.FIRST_NAME+"Vinay");
		System.out.println(ProfileConstance.LAST_NAME+"Virat");
		
	}

	@Override
	public void Hobbies() {
		System.out.println("Playing cricket");
	
		
	}

}
