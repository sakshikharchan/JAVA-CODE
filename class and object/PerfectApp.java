import java.util.*;
class perfect
{
	private int no;
	void setNum(int no)
	{
		this.no=no;
	}
	void calPer()
	{	int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0 )
			{
				sum=sum+i;
			}
		}
		if (no==sum)
		{
					System.out.println("perfect number");
		}
		else
			System.out.println("Not perfect number");
		
	}
}
public class PerfectApp
{
	public static void main(String x[])
	{
		perfect p = new perfect();
		p.setNum(6);
		p.calPer();
	}
}