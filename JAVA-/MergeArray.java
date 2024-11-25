import java.util.*;
class Merge
{	int arr1[],arr2[],i;
	void setValue(int a[],int b[])
	{
		arr1=a;
		arr2=b;
	}
	void showArray()
	{
	System.out.println("Enter the First Array");
	for( i=0;i<arr1.length;i++)
	{
		System.out.printf("%d\t",arr1[i]);
	
	}
	System.out.printf("\nEnter the second Array\n");
	for( i=0;i<arr2.length;i++)
	{
	 
	System.out.printf("%d\t",arr2[i]);
	
	}
	int length=arr1.length+arr2.length;
	int c[]=new int[length];
	int k=0;
	for(i=0;i<arr1.length;i++)
	{
	c[k]=arr1[i];
	k++;
	}
	for(i=0;i<arr2.length;i++)
	{
	c[k]=arr2[i];
	k++;
	}
	System.out.printf("\nResultant array\n");
	for( i=0;i<c.length;i++)
	{
		System.out.printf("%d\t",c[i]);	
	}

	}
}
public class MergeArray
{
	public static void main(String x[])
	{
	int a[]=new int[]{1,2,3,4,5};
	int b[]=new int[]{6,7,8,9,10};
	Merge m=new Merge();
	m.setValue(a,b);
	m.showArray();
	}
}