public class MaxMin {
 
  public void printMaxMin(int[] nums) {
   int maxone = 0;
   int maxtwo = 0;
   for(int n: nums) 
   {
     if(maxone < n) 
	 {
	  maxtwo = maxone;
	  maxone = n;
	 } else if(maxtwo < n) 
	  {
	   maxtwo = n;
	  }
	}
	   System.out.println("First Max Min: "+maxone);
	   System.out.println("Second Max Min: "+maxtwo);
	   
	}
  public static void main(String args[]) {
   int num[] = {-5, -34, -78, -2, -45, -1, -99, -23};
   MaxMin tag = new MaxMin();
   tag.printMaxMin(num);
}
}
   
	  
   
   