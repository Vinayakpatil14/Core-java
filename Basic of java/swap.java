package hefshine;
import javax.swing.*;


public class swap {
	public static void main(String [] args)
	{
		String a=JOptionPane.showInputDialog("enter 1st number :");
		int b=Integer.parseInt(a);
		String c=JOptionPane.showInputDialog("enter 2st number :");
		int d=Integer.parseInt(c);
		System.out.println(b+" "+d);
		b=b+d;
		d=b-d;
		b=b-d;
		System.out.println(b+" "+d);
		
	}

}
