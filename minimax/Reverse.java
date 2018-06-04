package com.minimax;

public class Reverse {
 int a[]= {2,3,4,5,6,7};
 
	public void Rev()
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		Reverse R=new Reverse();
		R.Rev();
	}
}
