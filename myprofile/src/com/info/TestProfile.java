package com.info;



public class TestProfile {
   static void printProfile (IProfile profile) {
	   profile.myBasicInfo();
	   profile.Hobbies();
   }
	   public static void main(String args[]) {
		   IProfile myProfile = new AravindProfile();
		   IProfile myProfile1 = new VinayProfile();
		   TestProfile.printProfile(myProfile);
		   TestProfile.printProfile(myProfile1);
		   
		   
	   
   }
}
