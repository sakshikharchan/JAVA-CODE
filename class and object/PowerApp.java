import java.util.*;
class Power
{
	int base,index,p=1;
	Power(int base,int index)
	{
		this.base=base;
		this.index=index;
	}
	int getPower()
	{
		for(int i=1;i<=index;i++)
		{
			p=p*base;
		}
		return p;
		
	}
	
}
public class PowerApp
{
public static void main(String x[])
{
	Scanner xyz=new Scanner(System.in);
	System.out.printf("Enter the base and index ");
	int b=xyz.nextInt();
	int i=xyz.nextInt();
	Power p1=new Power(b,i);
	int result=p1.getPower();
	System.out.println("power is" +result);
	
	
}
}