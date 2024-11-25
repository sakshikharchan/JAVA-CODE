import java.util.*;
public class SubsumArrayseven
{
	public static void main(String x[])
	{	int a[]={3,4,-7,1,3,3,1,-4};
		Scanner xyz=new Scanner(System.in);
		int target=5;
		for(int i=0;i<a.length;i++)
		{	int sum=a[i];
			for(int j=i+1;j<a.length;j++)
			{
             sum=sum+a[j];
				if (sum==target)
				{	System.out.printf("%d--->%d{",i,j);
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