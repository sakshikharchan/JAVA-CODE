class SwapDigit 
{
	private int no;
	void setValue(int no)
	{
		this.no=no;
	}
	int getNumAfterSwap()
	{
		int fd=0,ld;
		ld=no%10;
		while(no!=0)
		{
			fd=no%10;
			no=no/10;
		}
		System.out.println(+fd);
		System.out.println(+ld);
	}
}
public class SwapDigitApp
{
	public static void main(String x[])
	{
		SwapDigit sd = new SwapDigit();
		sd.setValue(123);
		sd.getNumAfterSwap();
	}
}