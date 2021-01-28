package hefshine;
import java.util.*;

public class intrest {
	public static void main(String [] args)
	{
		float p,t,r,intrest;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal");
		p=scan.nextFloat();
		System.out.println("enter rate of interest :");
		r=scan.nextFloat();
		System.out.print("enter year :");
		t=scan.nextFloat();
		scan.close();
		intrest=(p*t*r/100);
		System.out.print(intrest);
	}
	
	

}
