//WAP TO Find Subarray with given from the givnen array 
/*expected output : 
					[0--1]--->{ 3 4 }
					[0--5]--->{ 3 4 -7 1 3 3 }	
					[3--5]--->{ 1 3 3 }
					[4--6]--->{ 3 3 1 }
*/
import java.util.*;
public class SumSubArray
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int a[]={3,4,-7,1,3,3,1,-4};
		int target=7;
		for(int i=0;i<a.length;i++)
		{
			int sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum==target)
				{
					System.out.printf("[%d--%d]--->{",i,j);
					for(int k=i;k<=j;k++)
					{
						System.out.printf(" %d",a[k]);
					}
					System.out.printf(" }");
					System.out.printf("\n");
				}
			}
		}
	}
}