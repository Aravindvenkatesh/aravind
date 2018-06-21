import java.util.Scanner;

public class WifiPin {
   public static void main(String args[]){

   int sum=0,a=0,sum1=0,b=0,sum2=0;
   Scanner scan = new Scanner(System.in);
   System.out.println("please enter your room number");
   int rno= scan.nextInt();
   if (rno>100&&rno<1000)
   {
   char s[] = new char[50];
   System.out.println("please enter your name");
   s = scan.next().toCharArray();
   int n=rno;
   int c=n%100;
     c/=10;
   while (n>0)
     {
      a=n%10;
      sum+=a;
      n/=10;
     }
   if (sum>10)
    {
     while(sum>0)
   {
    sum1=sum%10;
    b+=sum1;
    sum/=10;
    }
        sum=b;
    }
    if(sum%2!=0) 
	{
			  sum=sum-1;
    }
         String s2[]= {")","!","@","#","$","%","^","&","*","("};
		System.out.println("wifiPin is "+sum+s2[sum]+s[s.length-1]+c);
		    }
		 else
		 {
			 System.out.println("please enter proper rno");
		 }
				
	}

}
