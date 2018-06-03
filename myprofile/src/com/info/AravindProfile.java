package com.info;

public class AravindProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		
		System.out.println(ProfileConstance.FIRST_NAME+"Aravind");
		System.out.println(ProfileConstance.LAST_NAME+"Gowda");
	}

	

	@Override
	public void Hobbies() {
		System.out.println("playing football");
		
		
	}


}
