package hefshine;

public class circle {
	float readious;
	float pi=3.14F;
	
	public void getparameter(float readious)
	{
		this.readious=readious;
	}
	public void perimeter()
	{
		System.out.println(2*pi*readious);
	}
	public void area()
	{
		System.out.println(2*readious*readious);
	}
	public static void main(String [] args)
	{
		circle c=new circle();
		c.getparameter(10);
		c.perimeter();
		c.area();
	}

}
