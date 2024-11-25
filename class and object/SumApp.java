import java.util.*;
class Sum
{
	int s=0;
	void CalSum(int []...a,int []...b)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("%d\t",a[i][j]);
				
			}
			System.out.printf("\n");
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.printf("%d\t",b[i][j]);
				
			}
			System.out.printf("\n");
		}
	}
	
}
public class SumApp
{
	public static void main(String x[])
	
	{
		Sum s=new Sum();
		s.CalSum(new int []{1,2,3},new int []{4,5,6},new int []{7,8,9});
		
	}
}