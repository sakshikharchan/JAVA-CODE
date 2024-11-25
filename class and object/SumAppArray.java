class sum
{
	int s=0;
	void calSum(int []...x)
	{
		for(int i=0;i<x.length;i++)
		
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.printf("%d\t",x[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
public class SumAppArray
{
	public static void main(String x[])
	{
		sum s=new sum();
		s.calSum(new int []{1,2,3},new int []{4,5,6},new int[]{7,8,9});
	}
	
}