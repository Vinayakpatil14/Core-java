package hefshine;
import java.util.*;

public class year {
	public static void main(String [] args)
	{
		int days,week,year;
		Scanner op=new Scanner(System.in);
		System.out.println("enter number");
		days=op.nextInt();
		
		year=days/365;
		week=(days % 365)/7;
		days=days-((year*365)+(week*7));
		
		System.out.print("number year"+year);
		System.out.println("number of week"+week);
		System.out.print("days"+days);
	}

}
