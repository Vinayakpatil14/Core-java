package hefshine;

public class Sum1
{
	float a;
	float b;

public void getnumber(int a, int b)
{
	this.a=a;
	this.b=b;
}
public void sum()
{
	float sum=a+b;
	System.out.println("sum is"+sum);
}
public void multi()
{
	float multi=a*b;
	System.out.println(multi);
}
public void minus()
{
	float minus=a-b;
	System.out.println(minus);
}
public void div()
{
	float div=a/b;
	System.out.println(div);
}
public static void main(String [] args)
{
	Sum1 s=new Sum1();
	s.getnumber(20, 10);
	s.sum();
	s.multi();
	s.minus();
	s.div();
	
}
}
