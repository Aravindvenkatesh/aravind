package arr;

public class Arr {
	public static void main(String args[]) {
		int n=1234;
		int number[]=new int[10];
		for(int i=0;i<number.length;i++)
		{
			number[i]=n%10;
			n/=10;
			System.out.println(number[i]);
		}
	}

}
