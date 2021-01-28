package hefshine;

public class Divided {
	
	float a;
	float b;
	
	
	public void getumber(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void div()
	{
		float result=a/b;
		System.out.print(result);
	}
	public static void main(String [] args)
	{
		
		Divided a=new Divided();
		a.getumber(2000,3);
		a.div();
		
				
	}

}
