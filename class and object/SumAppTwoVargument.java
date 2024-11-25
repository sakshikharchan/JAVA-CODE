class Sum
{   int s=0;
   void calSum(String name,int ...x)
   {   System.out.println("Name is "+name);
      for(int i=0; i<x.length;i++)
      { s = s+x[i];
      }
    System.out.printf("sum is %d\n",s);
   }
}
public class SumAppTwoVargument
{
    public static void main(String x[])
    {
	Sum s = new Sum();
	s.calSum("ABC",10,20,30,40,50);
    }
}
