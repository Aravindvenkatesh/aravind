package car;

public class carexample {

	 String model;
	 double speed;
 
      public Car(){
    	  
      }
      
      
      
      public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public boolean start() {
    	  return true;
      }
      public void accelerate() {
    	  
      }
      public static void main(String args[]) {
    	  Car car1 = new Car();
    	  Car car2 = new Car();
    	  
    	  Car1.speed = 20.0;
    	  Car2.speed = 30.0;
    	  
    	  System.out.println(car1.speed);
    	  System.out.println(car2.speed);
    	  
      }
}
