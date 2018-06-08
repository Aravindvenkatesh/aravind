package com.Operators;

public class Poly {
	public static void main(String[] args) {
		Poly pt=new Poly();
		final Taxi tc=new Taxi();
		SportsCar sc=new SportsCar();
		PoliceCar pc=new PoliceCar();
		
		pt.brake(pc);
		pt.brake(sc);
		pt.brake(tc);
		}
	public void brake(Car car) {
		  car.brake();

}
	
   }

