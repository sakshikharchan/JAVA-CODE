import java.util.*;
class SecondHighest
{
	int arr[],i,j;
	void setArray(int a[])
	{
		arr=a;
	}
	void showArray()
	{
		
		System.out.printf("\nbrefore sorting  the Array\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%d\t",arr[i]);
		}
		
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{	 if (arr[i]>arr[j])
				{
					
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.printf("\nAfter sorting\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.printf("%d\t",arr[i]);
		}
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[arr.length-1]==arr[i])
				++count;
		}
		System.out.println("Second Highest value is:"+arr[arr.length-(count +1)]);
	}
	
}
public class SecondHighestApp
{
	public static void main(String x[])
	{	int arr[]=new int [5];
		Scanner xyz=new Scanner (System.in);
		System.out.printf("Enter the Array\n");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=xyz.nextInt();
		}
		SecondHighest sh=new SecondHighest();
		sh.setArray(arr);
		sh.showArray();
	}
}