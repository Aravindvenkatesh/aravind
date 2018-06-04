package com.minimax;

public class Minimax {
		int a[]= {2,3,45,56,87,96};
		public int max()
		{
			int max= a[0];
			for(int i=0;i<a.length;i++)
			if(max<a[i])
			{
				max=a[i];
			}
				
			System.out.println(max);
			return(0);
		}
		public void mini()
		{
			int mini= a[0];
			for(int i=0;i<a.length;i++)
			if(mini>a[i])
			{
				mini=a[i];
			}
				
			System.out.println(mini);
		}
		
		public static void main(String[] args) {
			Minimax m=new Minimax();
			m.max();
			m.mini();
		}
}

