package operatorsexample;

public class operatorsexample {
  public static void main(String args[]) {
	  int count=10;
	  
	  if(count < 20) {
		   
	  }else if(count == 10) {
		  System.out.println(10);
	  }else {
		  System.out.println("None");
	  }
	  int response = count >20 ? 100 : 20;
	  int choice = 20;
	  switch (choice) {
	  case 10:
		  System.out.println(10);
		  break;
	  case 20:
		  System.out.println(20);
		  break;
	  case 30:
		  System.out.println(30);
		  break;
	 default:
		 System.out.println("default");
		 break;
	  }
		  switch ("one") {
		  case "rr":
			  System.out.println("rr");
			  break;
		  case "one":
			  System.out.println("one");
			  break;
		  case "two":
			  System.out.println("two");
			  break;
		 default:
			 System.out.println("default");
			 break;
	  }
		  int i=0;
		  while (i < 10) {
			  System.out.println("i ="+i);
			  i++;
	    }
	}
 }

  


