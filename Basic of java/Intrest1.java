package hefshine;

public class Intrest1
{
	double compoundintrest;
	double p;
	double r;
	double n;
	double t;
	
	public void calculate(int p,double d,int n,int t)
	{
		compoundintrest=p*Math.pow(1+(d/n),n*t);
		compoundintrest=compoundintrest-p;
		System.out.println(compoundintrest);
	}
	public static void main(String [] args)
	{
		Intrest1 ci=new Intrest1();
		ci.calculate(2000,0.08,12, 5);
	}
}
