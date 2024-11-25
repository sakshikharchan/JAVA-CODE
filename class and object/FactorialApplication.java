import java.util.*;
class Factorial 
{
	private int no;
	
	void setvalue(int no)
	{
		this.no=no;
	}
	void calFactorial()
	{	int fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println(+fact);
	}
}
public class FactorialApplication
{
	public static void main(String x[])
	{
		Factorial f=new Factorial();
		f.setvalue(5);
		f.calFactorial();
		
	}
}