package password;

public class FindPassword {
	static int v=0;
	static int p=0;
	static int password=0;
public void findpassword(int a,int b,int c,int d,int e) {
		
		show(a);
		show(b);
		show(c);
		show(d);
		show(e);
		//int p=p1+p2+p3+p4+p5;
		//return p;
	}
	public static void show(int x){
	String s=String.valueOf(x);
	String a="";
	//int password=0;
	int count=0;
	for(int i=0;i<s.length();i++)
	{
	for(int j=0;j<s.length();j++)
	{
	if(s.charAt(i)==s.charAt(j))
	{ 
	if(i!=j)
	{
		count=1;
	a += s.charAt(i); 
	}
	}
	}
	}
	if(count==0)
	{
		v+=1;
		//return password;
	}
	else
	{
	
	if(a.equals(s)==true)
	{ 
		v+=1;
	//return password;
	}
	else
	{
		p+=1;
	//password=Integer.parseInt(s);
	//return password;
	}
	}
	  password=((p*10)+v);
	}
	
	public static void main(String[] args) {
		FindPassword stable=new FindPassword();
		stable.findpassword(1313,12,122,678,898);
	    System.out.println(password);

}
}


